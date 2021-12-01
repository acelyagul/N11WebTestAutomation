package testcases.step_def;

import io.cucumber.java.en.Then;
import testcases.pages.StorePage;

public class StorePageSteps {
    StorePage storePage = new StorePage();



    @Then( "How many Store Reviews are made should be checked" )
    public void howManyStoreReviewsAreMadeShouldBeChecked() {
        storePage.switchCommentSection();
        storePage.verifyStoreComment();
    }

}
