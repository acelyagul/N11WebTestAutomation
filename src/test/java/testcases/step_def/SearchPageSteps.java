package testcases.step_def;

import io.cucumber.java.en.And;
import testcases.pages.SearchPage;

public class SearchPageSteps {
    SearchPage searchPage = new SearchPage();

    @And( "{string} Brand is selected in the search result" )
    public void brandIsSelectedInTheSearchResult(String brand) {
        searchPage.selectBrand(brand);
    }

    @And( "Navigate to {int}rd product" )
    public void navigateToRdProduct(int productNumber) {
        searchPage.chooseProduct(productNumber);
    }
}
