@regression
Feature: Admin User page page test


  Background: Admin User logs in
    Given User opens Url
    When user enters "admin@yahoo.com" as "Enter Username"
    And user enters "admin123" as "Enter Password"
    And user clicks "Login" button

  @USIN-10 @positive @smoke
  Scenario: Verify "Manage Access" button is displayed
    Then Verify "Manage Access" button is displayed


  @USIN-11 @positive
  Scenario: Admin should be able to edit or delete any question under Interview section
    Then Verify Edit button "btn-sm-outline-warning" is clickable
    Then Verify Delete button "btn-outline-danger" is clickable


  @USIN-12 @positive
  Scenario: Add a new dashboard
    When I add a new dashboard "Prep" as "New dashboard"
    Then user clicks "+ Add" button
    Then Verify "Prep" button is displayed

  @USIN-13 @positive
  Scenario Outline: Admin should see a form in Manage Access page with following fields
    When user clicks "Manage Access" button
    Then Verify following "<input fields>" and "<select fields>" are displayed:
    Examples:
      | input fields | select fields |
      | First Name   | Role          |
      | Last Name    | Batch         |
      | E-mail       | Batch         |


  @USIN-14 @positive
  Scenario: Admin should have an option to add a new user in Manage Access Page
    When user clicks "Manage Access" button
    Then I fill out new user form with following info:
      | First Name | Jon          |
      | Last Name  | Snow         |
      | E-mail     | snow@got.com |
      | Role       | Student      |
      | Batch      | 6            |
    And user clicks "Add User" button







