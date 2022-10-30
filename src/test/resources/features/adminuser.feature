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