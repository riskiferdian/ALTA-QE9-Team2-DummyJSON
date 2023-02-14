Feature: Testing get single user reqres API
  @Tugas
  Scenario: get single user with valid parameter id
    Given Get single user with valid id 2
    When Send request get single user
    Then Status code should be 200 OK
    And Response body id should be 2