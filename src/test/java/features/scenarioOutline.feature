Feature: Login with multiple users data
@scenarioOutline
  Scenario Outline: login with specific credentials
    Given user in a home page
    And user enter in a User Id as "<userid>"
    And user enter in a Password as "<password>"
    When user clicked on login button
    Then User should be able to logged in successfully

    Examples:
      | userid  | password |
      | abc@123 | a123     |
      | def@123 | b456     |
      | xyz@123 | c789     |
