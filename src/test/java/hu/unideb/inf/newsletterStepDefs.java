package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static hu.unideb.inf.AbstractStepDefs.homePage;
import static org.junit.Assert.fail;

public class newsletterStepDefs {
    @When("the newsletter button is clicked")
    public void the_newsletter_button_is_clicked() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clicknewsButton();
    }


    @Then("a {string} news error message is shown")
    public void a_news_error_message_is_shown(String msg) {
        Optional<String> errorMessage = homePage.getNewsError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        } else {
            fail();
        }
    }


    @Given("the {string} is filled")
    public void the_is_filled(String string) {
       homePage.fillField("newsletter-input","chotofu8@gmail.com");
    }

    @Then("a newsletter successful message displayed.")
    public void a_newsletter_successful_message_displayed() {
      homePage.getNewsletter_su();
    }


    @Given("the another {string} is filled")
    public void the_another_is_filled(String string) {
        homePage.fillField("newsletter-input","chotofu7@gmail.com");
    }

    @Then("a newsletter error \"This email address is already registered.\"displayed.")
    public void a_newsletter_error_this_email_address_is_already_registered_displayed() {
      homePage.getNewsError2();
    }

}


