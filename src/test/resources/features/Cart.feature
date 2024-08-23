Feature: Cart Functionality

  Background:
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user clicks on sign in button
    Then verify user is on sign in page
    When user enters mobile number "7207449458"
    And click on continue button
    And user enters otp and click on verify button
    Then verify user is on user home page

  Scenario: Verify product is add into cart and logout
    When user search for "Watch"
    Then verify user is redirected to the "Watch" products page
    When user clicks on first product
    Then verify user is on product description page
    When user clicks on add to cart button
    Then verify product is added into cart successfully
    When user clicks on profile button
    Then verify user is redirected to the profile section page
    When user clicks on sign out button
    Then verify user is on jio mart home page


  Scenario: Verify product is added in the cart after login
    When user clicks on cart icon
    Then verify product is added into cart successfully

