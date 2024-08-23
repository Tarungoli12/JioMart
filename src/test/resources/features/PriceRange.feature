Feature: Price Range Functionality

  Scenario: Verify products displayed are in specified price range
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user search for "Biscuits"
    Then verify user is redirected to the "Biscuits" products page
    When user specifies price range "5000"
