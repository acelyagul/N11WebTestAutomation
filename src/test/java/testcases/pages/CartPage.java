package testcases.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcases.utils.Driver;

public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".btn.btnBlack")
    public WebElement checkBox;
    @FindBy(name = "quantity")
    public WebElement quantity;
    public void verifyCartItem(String productNumber) {
        checkBox.click();
        String quantityValue = quantity.getAttribute("value");
        Assert.assertEquals(productNumber, quantityValue);
    }
}
