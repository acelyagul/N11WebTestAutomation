package testcases.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testcases.utils.Driver;
import testcases.utils.Helper;

import java.util.List;

public class StoreListingPage {

    public StoreListingPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    public void exportCSV() {
        List <WebElement> alphabet = Driver.get().findElements(By.xpath("//*[@class=\"letters\"]/span"));
        String elementsXpath = "//*[@class=\"tabPanel allSellers\"]//ul/li/a";
        Helper.exportStoreListToCSV(alphabet, "StoreList.csv", "StoreList", elementsXpath);
    }

    public void navigateToRandomStorePage(){
        int randomNumber = Helper.selectRandomNumber(50);
        String elementsXpath = "//*[@class=\"tabPanel allSellers\"]//ul/li/a";
        Helper.selectRandomStore(randomNumber,elementsXpath);
    }

}
