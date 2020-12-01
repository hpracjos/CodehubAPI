Feature: Get greeting
  Scenario: Trigger GET API and get greeting with id
    Given User define the Get call
    When  User is able to get response code from greetings endpoint
    Then   User validates the response body of greetings endpoint
