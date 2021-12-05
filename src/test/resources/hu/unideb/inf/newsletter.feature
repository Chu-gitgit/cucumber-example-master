
Feature: search test

  Scenario:
    Given the home page is opened
    When the newsletter button is clicked
    Then a "Newsletter : Invalid email address." news error message is shown


  Scenario:
    Given the home page is opened
    And the 'chotofu8@gmail.com' is filled
    When the newsletter button is clicked
    Then a newsletter successful message displayed.

  Scenario:
    Given the home page is opened
    And the another 'chotofu7@gmail.com' is filled
    When the newsletter button is clicked
    Then a newsletter error "This email address is already registered."displayed.

