Feature: Orange HRM

  Scenario: Successful Login
    Given I am in Orange HRM url
    When I logged in as a user
    Then user should be logged in succesfully
    When I logout

  Scenario: Paremeterized Login
    Given I am in Orange HRM url
    When I logged in as a "Admin" user
    Then user should be logged in succesfully
    When I logout

  Scenario: Login using Datatable
    Given I am in Orange HRM url
    When I logged in with below
      | Admin | admin123 |
    Then user should be logged in succesfully
    When I logout

@MultipleData
  Scenario Outline: Login with Multiple data
   
    When I logged in with "<Username>" "<Password>"
    Then user should be logged in succesfully
   

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |
      |Admin     | admin123 |
