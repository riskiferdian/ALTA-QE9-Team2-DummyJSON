Feature: testing add product
  Scenario: post add new product with valid data
    Given Post new product with valid json
    When Send request post new product
    Then Status code should be 200 OK
    And Response body page is new product with id