Feature: Login with Valid Credentials

  @sanity
  Scenario Outline: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "https://dsportalapp.herokuapp.com"
    When User navigate to MyAccount menu
    Then click on Login
    And User enters Username as "<username>" and Password as "<password>"
    And Click on Sign In button
   # Then User should be logged in successfully  
    Examples: 
      | username       | password   |
      | goaldiggers    | dsalgogo   |
      | goaldiggers@23 | dsalgogoal |
