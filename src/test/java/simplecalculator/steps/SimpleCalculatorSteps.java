package simplecalculator.steps;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Calculation;

/**
 * Created by saipkri on 09/02/16.
 */
public class SimpleCalculatorSteps {
    @Given("^a simple calculator$")
    public void aSimpleCalculator() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I input the numbers and perform calculation$")
    public void iInputTheNumbersAndPerformCalculation(final List<Calculation> calculations) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^I should see the results as \"([^\"]*)\"$")
    public void iShouldSeeTheResultsAs(String expectedResults) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
