Feature: get all products
  @Tugas
  Scenario: get all list of products
    Given Get all product list
    When Send request get all products
    Then Status code should be 200 OK