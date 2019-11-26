package Cucumber3;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cucumberimpl {
	@Given("^I entered [0-9]+ in the caluclator$")
	public void I_entered_50_in_the_calculator() {
		System.out.println("I entered 50 in the caluclator");
	}
	@And("^I press [a-zA-Z]{1,}$")
	public void I_press_add() {
		System.out.println("I press add");
	}
	@Then("^I have entered [0-9]+ in the calculator$")
	public void I_have_eneterd_50_in_the_calculator() {
		
		System.out.println("I have entered 50 in the calculator");
	}
	@And("I pressed equal")
       public void press_equal() {
		
		System.out.println("I pressed equal");
	}
	@Then("^the result should be [0-9]+$")
    public void result_should_be_100() {
		
		System.out.println("the result should be 100");
	}
	
		
}
