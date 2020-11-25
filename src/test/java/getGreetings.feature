Feature: Get greeting

  Scenario: Trigger GET API and get greeting with id
    Given User define the Get call
    When  User trigger the GET greetings endpoint
    Then  User is able to get response code
    And   User validates the response body