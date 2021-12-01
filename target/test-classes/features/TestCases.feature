Feature: Case Study Test Scenarios

  Background:
    Given Homepage is open
    And Close the pop up

  @regression
  Scenario: Store Verification
    And Navigate to "Mağazaları Gör" under "Mağazalar"
    And Export all store name to csv file
    When Navigate to any random Store's page
    Then How many Store Reviews are made should be checked


  @regression
  Scenario: Product Search and Cart Verification
    And With "maske" search is made
    And "Ece" Brand is selected in the search result
    And Navigate to 3rd product
    When The relevant product is added to the cart "2"
    And Going to my cart page
    Then The quantity control is done in the basket "2"