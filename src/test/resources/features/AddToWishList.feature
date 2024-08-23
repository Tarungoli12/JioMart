Feature: Wishlist Functionality

  Scenario: Verify user successfully added product to wishlist
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user clicks on sign in button
    Then verify user is on sign in page
    When user enters mobile number "7207449458"
    And click on continue button
    And user enters otp and click on verify button
    Then verify user is on user home page
    When user search for "Lays"
    Then verify user is redirected to the "Lay's" products page
    When user clicks on first product
    Then verify user is on product description page
    When user updates the location
    And user clicks on wish list icon
    Then verify product is added into wishlist successfully