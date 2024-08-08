Feature: Automation test site - Login tests

  @login @regression @sanity
  Scenario: User logins with valid credentials
    Given User is on login page
    When User enters valid "TestUser" and "Tester5027#"
    And User clicks the login button
    Then User lands on the home page