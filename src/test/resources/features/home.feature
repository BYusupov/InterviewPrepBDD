@InterviewAdds
Feature: Home page tests

  Background:
    Given User opens Url
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button

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

  @USIN-5 @smoke @regression
  Scenario: Add a question in dashboards
    When user clicks "Add do " button
    When user adds question "coding"
    When user clicks "Enter" button
    Then verify question "coding" is displayed

  @USIN-5a @smoke @regression
  Scenario: Add a question1 in dashboards
    When user clicks "Add do " button
    When user adds question "coding1"
    When user clicks "Enter" button
    Then verify question "coding1" is displayed

  @USIN-5b @smoke @regression
  Scenario: Add a question2 in dashboards
    When user clicks "Add do " button
    When user adds question "@coding1"
    When user clicks "Enter" button
    Then verify question "@coding1" is displayed


#  @USIN-6 @smoke @regression
#  Scenario: Edit or delete a question in dashboards
#    When user clicks "Add do " button
#    When user adds question "coding"
#    When user clicks "Enter" button
#    Then verify question "coding" is displayed


  @USIN-9
  Scenario: There should be a sign out button that takes me back to Login page
    When user clicks "Sign out" button


  @USIN-3 @smoke @regression
  Scenario Outline: Verify dashboard buttons are present
    Then Verify link text "<button>" is displayed
    Examples:
      | button        |
      | All Topics    |
      | Coding        |
      | Soft skills   |
      | New Dashboard |






