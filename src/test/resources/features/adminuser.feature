Feature: Admin User page test

  Background: Admin User logs in
    Given Admin User opens URL
    When admin user enters "admin@yahoo.com" as "Enter Username"
    And admin user enters "admin123" as "Enter Password"
    And user clicks "Login" button

  @USIN-10 @smoke
  Scenario: Verify "Manage Access" button is displayed
    Then Verify "Manage Access" button is displayed


  @USIN-11
  Scenario: Admin should be able to edit or delete any question under Interview section


  @USIN-12
  Scenario: Add a new dashboard
    When I add a new dashboard "Prep" as "New dashboard"
    Then I click "Add" button
    Then Verify "Prep" button is displayed

  @USIN-13
  Scenario: Admin should see a form in Manage Access page with following fields
    When I click "Manage Access" button
    Then Verify following input fields are displayed:
    | First Name |
    | Last Name  |
    | E-mail     |
    | Role       |
    | Batch      |

  @USIN-14
  Scenario: Admin should have an option to add a new user in Manage Access Page
    When I click "Manage Access" button
    Then I fill out new user form with following info:
      | First Name | Jon          |
      | Last Name  | Snow         |
      | E-mail     | snow@got.com |
      | Role       | Student      |
      | Batch      | 6            |
    And I click "Add User" button






