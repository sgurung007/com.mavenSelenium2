package myRunners;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testOneStep {
    @Given("I am in the home page")
    public void i_am_in_the_home_page() {
        System.out.println("printing from I am in the home page");
    }

    @When("I click to All Department")
    public void i_click_to_all_department() {
        System.out.println("printing from I click to All Department");
    }

    @When("I print out my title of the all department page")
    public void i_print_out_my_title_of_the_all_department_page() {
        System.out.println("printing from I print out my title of the all department page");
    }

    @Then("I assure the title of the page")
    public void i_assure_the_title_of_the_page() {
        System.out.println("printing from I assure the title of the page");
    }

}
