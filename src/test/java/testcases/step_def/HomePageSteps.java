package testcases.step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcases.pages.*;
import testcases.utils.ConfigFileReader;

public class HomePageSteps {

    Homepage homepage = new Homepage();

    @Given( "Homepage is open" )
    public void homepageIsOpen() {
        homepage.verifyHomePageTitle(ConfigFileReader.get("websiteTitle"));
    }

    @And( "Close the pop up" )
    public void closeThePopUp() {
        homepage.closeThePopup();
    }

    @And( "Navigate to {string} under {string}" )
    public void navigateToUnder(String secondMenu, String mainMenu) {
        homepage.navigateToStoreList(mainMenu, secondMenu);
    }


    @And( "With {string} search is made" )
    public void withSearchIsMade(String searchKey) {
        homepage.searchFor(searchKey);
    }




}
