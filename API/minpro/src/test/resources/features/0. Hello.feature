Feature: Hello

  As a user
  I want to get hello
  So that I can see hello

  Scenario: GET - Get hello with correct endpoints
    Given I set GET api endpoints hello
    When I send GET HTTP request hello
    Then I receive valid HTTP response code 200 comment