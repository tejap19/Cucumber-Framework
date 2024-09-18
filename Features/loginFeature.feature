Feature: login

  Scenario Outline: : Login with valid and Invalid data
    Given User navigate go to Test Automation store
    And User click on login and register option
    And User should give the username "<username>"
    And User should give the password "<password>"
    When User should click on login button
    Then Login should be successful
    And User should click on logout button
    Then browser should close

    Examples:
      |username|password|
      |tejap1999|Password@19|
      |mani08   |mani@123    |

