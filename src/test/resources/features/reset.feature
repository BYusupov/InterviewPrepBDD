@regression
Feature:

  Background: Navigate to home  page
    Given  User opens Url
    When user enters "admin@yahoo.com" as "Enter Username"
    And  user enters "admin123" as "Enter Password"
    And user clicks "Login" button

  @USIN-17
  Scenario: Verify "show all" button reset view and display all users
    And user clicks "All Topics" button
    Then user clicks "Show all" button
    
