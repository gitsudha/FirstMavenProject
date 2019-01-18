package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1StepDef {
    @When("^Login to project home page$")
    public void login_to_project_home_page() {
        System.out.println("I am in WHEN");
    }

    @Given("^Enter the details of project home page$")
    public void enter_the_details_of_project_home_page() throws Throwable {
        System.out.println("I am in GIVEN");

    }

    @Then("^Print the details of project home page$")
    public void print_the_details_of_project_home_page() throws Throwable {
        System.out.println("I am in THEN");
    }

}
