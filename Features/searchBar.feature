Feature: search

  Scenario: Search Bar functionality
    Given User navigate go to Test Automation store
    And User should click on home
    And User should click on search bar and search "Shoes"
    Then check weather shoes are displayed and check function of quantity,size
    And click on search "t-shirts"
    Then check t-shirts are displayed check functions
    And click on search the "lipstick"
    Then check lipstick are displayed check functions
    And close the browser


#    Examples:
#      |Items  |
#      |shoes  |
#      |t-shirts|
#      |lipstick|
