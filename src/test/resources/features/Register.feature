Feature: Register Functionality

  Scenario: Verify user can register successfully
    Given user opens jio mart website
    Then verify user is on jio mart home page
    When user clicks on sign in button
    Then verify user is on sign in page
    When user enters mobile number "9481827519"
    And click on continue button
    And user enters otp and click on verify button
    Then verify user is on register page
    When user enters valid register data