Feature: Data Driven Functionality

  Scenario Outline: Verify user can select different category and sub-category products
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user selects category type "<category>" and sub-category type "<sub-category>" and specific-type "<specific-product>"
    Then verify specific-product type "<specific-product>" of products are displayed

    Examples:
      | category           | sub-category        | specific-product |
      | Groceries          | Fruits & Vegetables | Fresh Fruits     |
      | Fashion            | Men                 | Footwear         |
      | Electronics        | Mobiles & Tablets   | Accessories      |
      | Wellness           | Personal Care       | Oral Care        |
      | Precious Jewellery | Fine Jewellery      | Gold Jewellery   |


