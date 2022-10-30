Feature: LogIn page test
Given User opens Url

  @USIN-1 @smoke @regression
  Scenario Outline: verify the title of the page
    When user enters "<Username>" as "Enter Username"
    And user enters "<Password>" as "Enter Password"
    And user clicks "Login" button
    Then verify the title of the page

    Examples:
      | Username       | Password |
      | test@yahoo.com | test123  |


