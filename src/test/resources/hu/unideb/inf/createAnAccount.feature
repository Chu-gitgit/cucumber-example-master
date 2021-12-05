Feature: create an account

  Background:
    Given the home page is opened
    And the Sign In link is clicked



  Scenario Outline:
    Given  the '<field>' is filled with '<parameter>'
    When  the create an account button is clicked
    Then the create account '<msg>' error message is shown
    Examples:
      | field        | parameter          | msg                                                                                                                  |
      | email_create |                    | Invalid email address.                                                                                               |
      | email_create | 123                | Invalid email address.                                                                                               |
      | email_create | debrecen           | Invalid email address.                                                                                               |
      | email_create | chotofu7@gmail.com | An account using this email address has already been registered. Please enter a valid password or request a new one. |




