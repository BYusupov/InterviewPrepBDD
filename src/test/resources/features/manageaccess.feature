@regression
Feature: Admin User page test

  Background: Admin User logs in
    Given  User opens Url
    When  user enters "admin@yahoo.com" as "Enter Username"
    And  user enters "admin123" as "Enter Password"
    And user clicks "Login" button

  @USIN-15 @regression
  Scenario: Verify an option to filter the users
    When I click "Manage Access" button
    Then Verify following options are displayed:
      | Firstname   |
      | Lastname    |
      | Email       |
      | Role        |
      | Batch       |


