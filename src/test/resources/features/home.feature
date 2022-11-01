@regression
Feature: Home page tests

  Background:
    Given User opens Url
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button

  @USIN-9
  Scenario: There should be a sign out button that takes me back to Login page
    When user clicks "Sign out" button


  @USIN-4 @regression
  Scenario Outline: Do's and Don't statement should only take letters and number
    And User clicks on a button "Add do "
    And User clicks on "Add don't" button
    And User input "test test 123"
    And User input text "123 123 test"
    And User clicks on a button "Enter"
    And User clicks on a button Enter on the Dont's side
    Then Verify "<inputText>" is displayed
    Examples:
      | inputText     |
      | test test 123 |
      | 123 123 test  |

  @USIN-4b @regression
  Scenario Outline: Do's and Don't statement should not take symbols
    When User clicks on a button "Add do "
    And User clicks on "Add don't" button
    And User input "Team#@ test"
    And User input text "&& test"
    And User clicks on a button "Enter"
    And User clicks on a button Enter on the Dont's side
    Then Verify "<symbols>" is not displayed
    Examples:
      | symbols     |
      | Team#@ test |
      | && test     |

  @USIN-3 @smoke @regression
  Scenario Outline: Verify dashboard buttons are present
    Then Verify link text "<button>" is displayed
    Examples:
      | button        |
      | All Topics    |
      | Coding        |
      | Soft skills   |
      | New Dashboard |

  @USIN-2 @smoke @regression
  Scenario:Verify user can see sign out button and shouldn't have manage access button
    And verify "Sign out" button is displayed
    Then verify "manage access" button is not displayed






