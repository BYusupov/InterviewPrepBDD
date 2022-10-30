Feature: Home page tests
Given User opens Url
  Background:

    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button

  @USIN-9
  Scenario: There should be a sign out button that takes me back to Login page
    When user clicks "Sign out" button



