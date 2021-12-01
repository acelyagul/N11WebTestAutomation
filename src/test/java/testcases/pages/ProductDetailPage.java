package testcases.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testcases.utils.Driver;
import testcases.utils.Helper;

public class ProductDetailPage {

    public ProductDetailPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "quantity")
    public WebElement quantityBox;
    @FindBy(css = ".btn.btnGrey.btnAddBasket")
    public WebElement addToCartButton;
    public void addedToCart(String productNumber) {
        quantityBox.click();
        quantityBox.clear();
        quantityBox.sendKeys(productNumber);
        addToCartButton.click();
        Helper.waitFor(2);
    }

    @FindBy(className = "myBasket")
    public WebElement cartButton;
    public void goToMyCartPage() {
        cartButton.click();
    }


}


