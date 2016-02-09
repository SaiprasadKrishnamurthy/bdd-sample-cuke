package buybestketchup.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by saipkri on 09/02/16.
 */
public class BuyBestKetchupSteps {

    @Given("^Im on google\\.com page$")
    public void imOnGoogleComPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchKeyword) throws Throwable {
        // Code here.
    }

    @Then("^I should see \"([^\"]*)\" shown on my search results$")
    public void iShouldSeeShownOnMySearchResults(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
