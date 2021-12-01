package testcases.step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import testcases.pages.ProductDetailPage;

public class ProductDetailPageSteps {
    ProductDetailPage productDetailPage = new ProductDetailPage();


    @When( "The relevant product is added to the cart {string}" )
    public void theRelevantProductIsAddedToTheCart(String productNumber) {
        productDetailPage.addedToCart(productNumber);
    }

    @And( "Going to my cart page" )
    public void goingToMyCartPage() {
        productDetailPage.goToMyCartPage();
    }

}
