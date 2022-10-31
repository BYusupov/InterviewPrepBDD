Feature: Coding page scenarios

  Background:
    Given User opens Url
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button
    When user clicks "Coding" button

  @USIN-5 @smoke @regression
  Scenario: Add a question in coding dashboard
    When user clicks "Enter new question " button
    When user adds question "Array reverse" as "Your Question..."
    When user clicks "Enter" button
    Then verify question "Array reverse   " is displayed

  @USIN-5a @smoke @regression
  Scenario: Add a question in coding dashboard
    When user clicks "Enter new question " button
    When user adds question "Max/min number from an array" as "Your Question..."
    When user clicks "Enter" button
    Then verify question "Max/min number from an array   " is displayed

  @USIN-5b @smoke @regression
  Scenario: Add a question in coding dashboard
    When user clicks "Enter new question " button
    When user adds question "Sum of 2" as "Your Question..."
    When user clicks "Enter" button
    Then verify question "Sum of 2   " is displayed

  @USIN-6
  Scenario: Modify coding dashboard questions

