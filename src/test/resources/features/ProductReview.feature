Feature: Price Range Functionality

  Scenario: Verify products displayed are in specified price range
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user clicks on sign in button
    Then verify user is on sign in page
    When user enters mobile number "7207449458"
    And click on continue button
    And user enters otp and click on verify button
    Then verify user is on user home page
    When user search for "Watch"
    Then verify user is redirected to the "Watch" products page
    When user clicks on first product
    Then verify user is on product description page
    When user clicks on write a review
    Then verify review rating popup is displayed
