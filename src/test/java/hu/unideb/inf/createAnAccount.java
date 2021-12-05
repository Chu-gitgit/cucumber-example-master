package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static hu.unideb.inf.AbstractStepDefs.homePage;
import static org.junit.Assert.fail;

public class createAnAccount {

    @Given("the {string} is filled with {string}")
    public void theFieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }



    @When("the create an account button is clicked")
    public void the_create_an_account_button_is_clicked() {
        homePage.clicksubmitcreate();
    }

    @Then("the create account {string} error message is shown")
    public void the_create_account_error_message_is_shown(String msg) {
        Optional<String> errorMessage = homePage.getcreateAccountError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        } else {
            fail();
        }
    }




    @Given("the email address is filled with {string} in the create an account")
    public void the_email_address_is_filled_with_in_the_create_an_account(String string) {
        // Write code here that turns the phrase above into concrete actions
        homePage.fillField("email_create", string);
    }

    @Then("the create an account showing in the page")
    public void the_create_an_account_showing_in_the_page() {

    }


    @Then("a {string} button shown")
    public void a_button_shown(String string) {
        homePage.getSubmitAccount();
    }

    //2
    @When("clicked the Register button")
    public void clicked_the_register_button() {
       homePage.submitAccountClicked();
    }

}


