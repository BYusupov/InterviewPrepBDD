Feature: LogIn page test

  Background:
    Given User opens Url


#  Scenario Outline: verify the title of the page
#    When user enters "<Username>" as "Enter Username"
#    And user enters "<Password>" as "Enter Password"
#    And user clicks "Login" button
#    Then verify the title of the page
#
#    Examples:
#      | Username       | Password |
#      | test@yahoo.com | test123  |

  @USIN-1 @smoke @regression
  Scenario: verify the title of the page
    When user enters "test@yahoo.com" as "Enter Username"
    And user enters "test123" as "Enter Password"
    And user clicks "Login" button
    Then verify the title of the page


  @USIN-17
  Scenario Outline: Verify "show all" button reset view and display all users
    When Verify button "<show all>" is displayed
    Then I click link text "<show all>"
    Examples:
      | linkText      | URL                                        |
      | Sauce Demo    | https://interview-prep-test.herokuapp.com  |





