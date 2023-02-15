Feature: get all todos

  Scenario: Get all todo with valid parameter
    Given Get all todo with valid parameter
    When Send request get all todo
    Then Status code should be 200 OK


  Scenario Outline: Get all todo with invalid parameter id
    Given Get all todo with invalid parameter id <id>
    When Send request get all todo
    Then Status code should be 404 Not Found
    Examples:
      | id  |
      | 151 |