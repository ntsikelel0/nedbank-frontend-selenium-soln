Feature: Automation test site - Home Page tests


  Background: : User logins with valid credentials
    Given User is on login page
    When User enters valid "TestUser" and "Tester5027#"
    And User clicks the login button
    Then User lands on the home page

  @home @regression @sanity
  Scenario: User buys a bottle of wine
    When User goes to shop
    And User goes to wines category
    And User adds a wine to cart and places order
    Then User gets the order number
