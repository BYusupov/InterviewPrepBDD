Feature: Home page tests

  Background: Navigate to Home page
    Given User opens Url
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button


  @USIN-3 @smoke @regression
  Scenario Outline: Verify dashboard buttons are present
    Then Verify link text "<button>" is displayed
    Examples:
      | button        |
      | All Topics    |
      | Coding        |
      | Soft skills   |
      | New Dashboard |




