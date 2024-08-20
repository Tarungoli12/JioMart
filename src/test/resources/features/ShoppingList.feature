Feature: ShoppingList Functionality

  Scenario: Validate ShoppingList
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user clicks on hamburger menu
    And enters product names separated by commas "search.value"
    And clicks on search all button
    Then validate the searched products are displayed in items page