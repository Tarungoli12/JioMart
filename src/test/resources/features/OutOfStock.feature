Feature: Product Out Of Stock Functionality

  Scenario: Verify out of stock products are displayed
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user search for "Biscuits"
    Then verify user is redirected to the "Biscuits" products page
    When user clicks on include out of stock button
    Then verify out of stock products are displayed