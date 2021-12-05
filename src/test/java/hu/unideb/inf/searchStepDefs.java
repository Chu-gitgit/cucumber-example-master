package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static hu.unideb.inf.AbstractStepDefs.homePage;

public class searchStepDefs {
    @Given("the search input is filled with {string}")
    public void the_search_input_is_filled_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        homePage.fillField("search_query_top", "t");

    }

    @Given("the search bar input is filled with {string}")
    public void the_search_bar__input_is_filled_with(String string) {
        // Write code here that turns the phrase above into concrete actions
        homePage.fillField("search_query_top", "Printed Chiffon Dress");

    }

    @When("the search button is clicked")
    public void the_search_button_is_clicked() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clicksearchButton();

    }

    @Then("a \"No results were found for your search \"t\" error message is shown")
    public void a_no_results_were_found_for_your_search_t_error_message_is_shown() {
        // Write code here that turns the phrase above into concrete actions

    }


    @Then("a search error displayed")
    public void a_search_error_displayed() {
       homePage.getSearchError();
    }


    @Then("a Printed Chiffon Dress displayed")
    public void a_printed_chiffon_dress_displayed() {
       homePage.getPrintedDress();
    }





}




