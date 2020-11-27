Feature: Get greeting
  Scenario: Trigger GET API and get greeting with id
    Given User define the Get call
    When  User performs GET operation
    Then  User is able to get response code from greetings endpoint
    And   User validates the response body of greetings endpoint