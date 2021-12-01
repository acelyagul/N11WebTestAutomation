package testcases.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Helper {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void openDropDownMenu(String menuText){
        Driver.get().findElement(By.xpath("//span[@title='"+menuText+"']")).click();
    }

    public static void clickWithLinkText(String linkText){
        Driver.get().findElement(By.linkText(linkText)).click();
    }

    public static void switchLastTab() {
        String originTab = Driver.get().getWindowHandle();
        Set<String> allTabs = Driver.get().getWindowHandles();

        for(String tab : allTabs){
            if(!originTab.equals(tab))
                Driver.get().switchTo().window(tab);
        }
    }

    public static void selectProductFromList(Integer productNumber, String locator){
        List<WebElement> resultProductsList = Driver.get().findElements(By.cssSelector(locator));
        WebElement productName = resultProductsList.get(productNumber-1);
        clickWithLinkText(productName.getText());
    }


    public static void exportStoreListToCSV(List <WebElement> alphabet, String fileLocation, String titleCSV, String elementsXpath){
        try {
            FileWriter csvWriter=new FileWriter(fileLocation);
            csvWriter.append(titleCSV);
            csvWriter.append("\n");

            for (WebElement element : alphabet) {
                element.click();
                Helper.waitFor(5);
                List<WebElement> elements= Driver.get().findElements(By.xpath(elementsXpath));
                for (int i=0; i < elements.size(); i++) {
                    csvWriter.append(elements.get(i).getText());
                    csvWriter.append("\n");
                }
            }
            csvWriter.flush();
            csvWriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static int selectRandomNumber(Integer randomNumberSize){
        Random random = new Random();
        return random.nextInt(randomNumberSize);
    }

    public static void selectRandomStore(Integer randomNumber, String elementsXpath){
        List<WebElement> elements = Driver.get().findElements(By.xpath(elementsXpath));
        Helper.clickWithLinkText(elements.get(randomNumber).getText());
    }



}
