Feature:

  Background: Navigate to home  page
    Given I open url of homepage
    When I click nav button "all topics"

  @USIN-17
  Scenario Outline: Verify "show all" button reset view and display all users
    When Verify button "<show all>" is displayed
    Then I click link text "<show all>"
    Examples:
      | linkText      | URL                                        |
      | Sauce Demo    | https://interview-prep-test.herokuapp.com  |
