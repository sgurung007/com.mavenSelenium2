package stepDefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RunTwoStep {
    @Given("I am in the home page test two")
    public void i_am_in_the_home_page_test_two() {
        System.out.println("I am in the home page test two");
    }

    @When("I click to All Department test two")
    public void i_click_to_all_department_test_two() {
        System.out.println("I click to All Department test two");
    }
    @When("I print out my title of the all department page test two")
    public void i_print_out_my_title_of_the_all_department_page_test_two() {
        System.out.println("I print out my title of the all department page test two");
    }
    @Then("I assure the title of the page test two")
    public void i_assure_the_title_of_the_page_test_two() {
        System.out.println("I assure the title of the page test two");
    }

}
