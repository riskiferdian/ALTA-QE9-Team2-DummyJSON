Feature: Testing get single product dummy json
<<<<<<< Updated upstream
  #Positive case
  @Tugas
=======
  @Tugas
  #Positive case
>>>>>>> Stashed changes
  Scenario: get all product with valid parameter
    Given Get single product with valid id 2
    When Send request get single product
    Then Status code should be 200 OK
    And Response body id should be 2
    And validate json schema get all products

<<<<<<< Updated upstream
    #Negative case
    @Tugas
    Scenario: Get single product with invalid parameter id
      Given Get single product with invalid id "xyz"
=======
    @Tugas
    #Negative case
    Scenario: Get single product with invalid parameter id
      Given Geti single product with invalid id "xyz"
>>>>>>> Stashed changes
      When Send request get single product
      Then Status code should be 404 Not Found