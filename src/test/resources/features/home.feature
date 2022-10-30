@InterviewAdds
Feature: Home page tests
  Background:
    Given User opens Url
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button

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


