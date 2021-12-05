package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Optional;

import static hu.unideb.inf.AbstractStepDefs.homePage;
import static org.junit.Assert.fail;

public class RegisterAnAccount {
    @Given("the first name is filled with {string}")
    public void the_first_name_is_filled_with(String string) {
        homePage.fillField("customer_firstname","chu");

    }

    @Then("a register {string} error message is shown")
    public void then_a_error_message_is_shown(String string) {
        Optional<String> errorMessage = homePage.getregistererrors();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(string, errorMessage.get());
        } else {
            fail();
        }
    }


    @Given("the last name is filled with {string}")
    public void the_last_name_is_filled_with(String string) {
       homePage.fillField("customer_lastname","siyuan");
    }


    @Given("the password filled with {string}")
    public void the_password_filled_with(String string) {
      homePage.fillField("passwd","123456");
    }


    @Given("the address is filled and the city is filled")
    public void the_address_is_filled_and_the_city_is_filled() {
      homePage.fillField("address1","110 Hadhazi way");
      homePage.fillField("city","Debrecen");
    }

    @Given("phone number is filled with'{int}'")
    public void phone_number_is_filled_with(Integer int1) {
        homePage.fillField("phone_mobile","307486679");
    }


    @Given("postal code filled {string}")
    public void postal_code_filled(String string) {
       homePage.fillField("postcode",string);
    }




    @Given("the State Field is selected with {string} in register form")
    public void the_state_field_is_selected_with_in_register_form(String string) {
        homePage.selectDropDown("id_state",string);
    }


    @Then("My account information displayed")
    public void my_account_information_displayed() {
        homePage.getField(HomePage.welcomeToAccount);
    }


}