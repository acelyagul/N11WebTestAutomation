$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestCases.feature");
formatter.feature({
  "name": "Case Study Test Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Homepage is open",
  "keyword": "Given "
});
formatter.match({
  "location": "testcases.step_def.HomePageSteps.homepageIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close the pop up",
  "keyword": "And "
});
formatter.match({
  "location": "testcases.step_def.HomePageSteps.closeThePopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Store Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Navigate to \"Mağazaları Gör\" under \"Mağazalar\"",
  "keyword": "And "
});
formatter.match({
  "location": "testcases.step_def.HomePageSteps.navigateToUnder(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Export all store name to csv file",
  "keyword": "And "
});
formatter.match({
  "location": "testcases.step_def.StoreListingPageSteps.exportAllStoreNameToCsvFile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to any random Store\u0027s page",
  "keyword": "When "
});
formatter.match({
  "location": "testcases.step_def.StoreListingPageSteps.navigateToAnyRandomStoreSPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "How many Store Reviews are made should be checked",
  "keyword": "Then "
});
formatter.match({
  "location": "testcases.step_def.StorePageSteps.howManyStoreReviewsAreMadeShouldBeChecked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});