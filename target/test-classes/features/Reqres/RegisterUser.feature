Feature: Testing register user reqres API
#  @Tugas
#  Scenario: register user with valid json file
#    Given Register user with valid json file
#    When Send request register user
#    Then Status code should be 200 OK
#    And Response body id should be 4 and token "QpwL5tke4Pnpja7X4"

  @Latihan
  Scenario: Register user
    Given Register user with valid json
    When Send request register user
    Then Status code should be 200 OK