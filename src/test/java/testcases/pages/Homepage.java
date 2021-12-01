package testcases.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcases.utils.Driver;
import testcases.utils.Helper;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void verifyHomePageTitle(String title) {
        Assert.assertEquals(title, Driver.get().getTitle());
    }

    @FindBy(className = "dn-slide-deny-btn")
    public WebElement closeButton;
    public void closeThePopup(){
        closeButton.click();
    }

    @FindBy(id = "searchData")
    public WebElement searchBox;
    @FindBy(className = "searchBtn")
    public WebElement searchButton;
    public void searchFor(String searchKey) {
        searchBox.click();
        searchBox.sendKeys(searchKey);
        searchButton.click();
    }

    public void navigateToStoreList(String mainMenu, String secondMenu){
        Helper.openDropDownMenu(mainMenu);
        Helper.clickWithLinkText(secondMenu);
    }


}
