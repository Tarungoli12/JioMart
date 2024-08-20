Feature: Sorting Functionality

  Background:
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user search for "product.name"
    Then verify user is redirected to the "product.name" products page


  Scenario Outline: Validate products are sorted

    When user performs sorting "<sort type>"

    Examples:
      | sort type          |
      | Price: Low to High |
      | Price: High to Low |