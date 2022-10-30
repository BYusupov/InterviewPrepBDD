Feature: LogIn page test
Given User opens Url

  @USIN-1 @smoke @regression
  Scenario: verify the title of the page
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button
    Then verify the title of the page



