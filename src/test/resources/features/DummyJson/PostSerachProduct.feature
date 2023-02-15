Feature: testing search
  Scenario: post search product with valid path
    Given post search product with valid path
    When Send request post search product
    Then Status code should be 200 OK