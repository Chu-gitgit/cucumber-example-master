Feature: register an account

  Background:
    Given the home page is opened
    And the Sign In link is clicked
    And  the email address is filled with 'chotofu20@gmail.com' in the create an account
    And the create an account button is clicked

  Scenario:
  Given the first name is filled with 'chu'
  When clicked the Register button
    Then a "There are 7 errors" error message is shown


  Scenario:
    Given the first name is filled with 'chu'
    And the last name is filled with 'siyuan'
    When clicked the Register button
    Then a "There are 6 errors" error message is shown

  Scenario:
    Given the first name is filled with 'chu'
    And the last name is filled with 'siyuan'
    And the password filled with 'passwd'
    When clicked the Register button
    Then a register "There are 5 errors" error message is shown

  Scenario:
    Given the first name is filled with 'chu'
    And the last name is filled with 'siyuan'
    And the password filled with 'passwd'
    And the address is filled and the city is filled
    When clicked the Register button
    Then a register "There are 3 errors" error message is shown

  Scenario:
    Given the first name is filled with 'chu'
    And the last name is filled with 'siyuan'
    And the password filled with 'passwd'
    And the address is filled and the city is filled
    And phone number is filled with'307486687'
    When clicked the Register button
    Then a register "There are 2 errors" error message is shown


  Scenario:
    Given the first name is filled with 'chu'
    And the last name is filled with 'siyuan'
    And the password filled with 'passwd'
    And the address is filled and the city is filled
    And phone number is filled with'307486687'
    And postal code filled '40322'
    And the State Field is selected with "Alaska" in register form
    When clicked the Register button
    Then My account information displayed



