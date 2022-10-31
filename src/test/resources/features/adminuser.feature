
Feature: Admin User page page test
Given Admin User opens Url

  @USIN-10 @smoke @regression
  Scenario Outline: Admin logs in
    When admin user enters "<Username>" as "Enter Username"
    And admin user enters "<Password>" as "Enter Password"
    And user clicks "Login" button
    Then verify "Manage Access" button is visible

    Examples:
      | Username       | Password |
      | admin@yahoo.com | admin123  |

Feature: Admin User page test

  Background: Admin User logs in
    Given Admin User opens URL
    When Admin User enters "admin@yahoo.com" as "Enter Username"
    And Admin User enters "admin123" as "Enter Password"
    And Admin User clicks "Login" button

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
    Then I click "Add" button
    Then Verify "Prep" button is displayed

  @USIN-13 @positive
  Scenario: Admin should see a form in Manage Access page with following fields
    When I click "Manage Access" button
    Then Verify following input fields are displayed:
    | First Name |
    | Last Name  |
    | E-mail     |
    | Role       |
    | Batch      |

  @USIN-14 @positive
  Scenario: Admin should have an option to add a new user in Manage Access Page
    When I click "Manage Access" button
    Then I fill out new user form with following info:
      | First Name | Jon          |
      | Last Name  | Snow         |
      | E-mail     | snow@got.com |
      | Role       | Student      |
      | Batch      | 6            |
    And I click "Add User" button







