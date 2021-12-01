package testcases.step_def;

import io.cucumber.java.en.Then;
import testcases.pages.CartPage;

public class CartPageSteps {
    CartPage cartPage = new CartPage();


    @Then( "The quantity control is done in the basket {string}" )
    public void theQuantityControlIsDoneInTheBasket(String productNumber) {
        cartPage.verifyCartItem(productNumber);
    }
}
