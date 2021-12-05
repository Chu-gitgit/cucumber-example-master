Feature: search test

  Background:
    Given the home page is opened

  Scenario:
    Given the search button is clicked
    Then a search error displayed

  Scenario:
    Given the search input is filled with "t"
    When the search button is clicked
    Then a "No results were found for your search "t" error message is shown

  Scenario:
    Given the search bar input is filled with "Printed Chiffon Dress"
    When the search button is clicked
    Then a Printed Chiffon Dress displayed




