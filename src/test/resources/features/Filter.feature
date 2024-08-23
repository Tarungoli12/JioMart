Feature: Filter Functionality

  Scenario: Verify only selected brand products are displayed
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user search for "Laptops"
   #Then verify user is redirected to the "Laptop" products page

    When user scrolls down and clicks on brand filter
    Then verify different brands are displayed
    When user selects brand "HP"
    Then verify all products displayed are from the selected brand "HP"