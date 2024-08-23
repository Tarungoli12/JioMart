Feature: Cart Value Validation Functionality

  Scenario Outline: User searches for products, adds multiple products in to the cart, and verifies the cart value
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user search for "<searchKey1>"
    Then verify user is redirected to the "<searchKey1>" products page
    When user clicks on first product
    Then verify user is on product description page
    When user clicks on add to cart button
    When user search for "<searchKey2>"
    Then verify user is redirected to the "<searchKey2>" products page
    When user clicks on first product
    Then verify user is on product description page
    When user clicks on add to cart button
    And user clicks on cart icon
    Then verify cart contains correct products count and cart value

    Examples:
      | searchKey1 | searchKey2 |
      | Coffee     | Tea        |
      | Rice Flour | Atta       |
      | Spoons     | Fork       |
      | Dairy Milk | Munch      |
