package testcases.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import testcases.utils.Driver;
import testcases.utils.Helper;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void selectBrand(String brand) {
        Driver.get().findElement(By.cssSelector("input#brand-m-"+brand)).click();
    }

    public void chooseProduct(Integer productNumber) {
        Helper.selectProductFromList(productNumber,"h3.productName ");
    }


}
