@soft-skills
Feature: soft skills page feature

  Background: navigate to home page
    When User opens Url
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button


  @USIN-8 @regression
    Scenario: soft skills filter
    And user clicks on "Soft skills" button
    And user should be able to enter "git" in search and get related question
    And verify the criteria is no more than 40 chars
    And Show all button should bring back all questions
