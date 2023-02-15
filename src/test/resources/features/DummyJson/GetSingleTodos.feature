Feature: Get single todos

  Scenario Outline: Get a single todo with valid parameter id
    Given Get a single todo with walid parameter id <id>
    When Send request get a single todo
    Then Status code should be 200 OK
    Examples:
      | id |
      | 72 |

  Scenario: Get a single todo with invalid parameter
    Given Get a single todo with invalid parameter "xyz"
    When Send request get a single todo
    Then Status code should be 404 Not Found