package testcases.step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import testcases.pages.StoreListingPage;

public class StoreListingPageSteps {
    StoreListingPage storeListingPage = new StoreListingPage();

    @And( "Export all store name to csv file" )
    public void exportAllStoreNameToCsvFile() {
        storeListingPage.exportCSV();
    }

    @When( "Navigate to any random Store's page" )
    public void navigateToAnyRandomStoreSPage() {
        storeListingPage.navigateToRandomStorePage();
    }
}
