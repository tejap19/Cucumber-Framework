Feature: My Account\

  Scenario Outline:
    Given User navigate go to Test Automation store
    And User should go to login
    And login using "<username>" and "<password>"
    Then home page should display
    And user should go to my account page
    And check all button are visible or not
    Then check all buttons are working or not
    Then click on logout
    Then browser should close



    Examples:
      |username |password|
      |tejap1999|Password@19|