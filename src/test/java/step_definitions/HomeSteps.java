package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;
    LoginPage loginPage;


    public HomeSteps() {
        page = new HomePage();
        loginPage = new LoginPage();
    }

    @Given("User opens Url")
    public void userOpensUrl() {
        BrowserUtils.getDriver();
    }

    @When("user adds question {string}")
    public void user_adds_question(String input) {
        BrowserUtils.sendKeys(page.inputField, input);
    }

    @Then("verify question {string} is displayed")
    public void verifyQuestionIsDisplayed(String question) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, question))));

    }

    @Then("Verify link text {string} is displayed")
    public void verifyLinkTextIsDisplayed(String dashboardBtns) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_BUTTON, dashboardBtns))));

    }

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String Signout) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, Signout))));
    }
}

