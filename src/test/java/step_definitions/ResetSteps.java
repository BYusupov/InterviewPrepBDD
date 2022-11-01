package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.LoginPage;

public class ResetSteps implements CommonPage {

    LoginPage page;

    public ResetSteps() {
        page = new LoginPage();
    }

    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
    }

    @When("I click nav button {string}")
    public void iClickNavButton(String alltopics) {

    }

    @When("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String showall) {
    }

    @Then("I click link text {string}")
    public void iClickLinkText(String showall) {
    }
}
