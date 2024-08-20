Feature: Cart Functionality

  Scenario: Verify user successfully added product into the cart
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user clicks on sign in button
    Then verify user is on sign in page
    When user enters mobile number "7207449458"
    And click on continue button
    And user enters otp and click on verify button
    Then verify user is on user home page
    When user search for "iPhone"
    Then verify user is redirected to the "iPhone" products page
    When user clicks on first product
    Then verify user is on product description page
    When user clicks on add to cart button
    Then verify product is added into cart successfully