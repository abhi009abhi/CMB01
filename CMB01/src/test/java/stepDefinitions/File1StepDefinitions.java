package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class File1StepDefinitions {

	@Given("this is given one")
	public void this_is_given_one() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("given");
	}

	@When("this is when one")
	public void this_is_when_one() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("when");
	}

	@Then("this is one the")
	public void this_is_one_the() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("then");
	}


	
}
