package step_definitions;

import io.cucumber.java.en.And;
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


    @Then("Verify link text {string} is displayed")
    public void verifyLinkTextIsDisplayed(String dashboardBtns) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_BUTTON, dashboardBtns))));

    }

    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String Signout) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, Signout))));
    }

    @When("User clicks on {string} button")
    public void userClicksOnButton(String string) {
        BrowserUtils.click(page.dontBtn);
    }

    @Then("User input {string}")
    public void userInput(String doTxt) {
        BrowserUtils.sendKeys(page.doInput, doTxt);
    }

    @Then("User input text {string}")
    public void userInputText(String dontTxt) {
        BrowserUtils.sendKeys(page.dontInput, dontTxt);
    }

    @When("User clicks on a button {string}")
    public void user_clicks_on_a_button(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_BUTTON, button))));
    }

    @And("User clicks on a button Enter on the Dont's side")
    public void userClicksOnAButtonEnterOnTheDontSSide() {
        BrowserUtils.click(page.enterDontBtn);
    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String inputText) {
        BrowserUtils.assertEquals(inputText, BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT, inputText))).getText());
    }

    @Then("Verify {string} is not displayed")
    public void verifyIsNotDisplayed(String symbols) {
        String expected = "";
        BrowserUtils.assertEquals(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, symbols))).getText(), expected);

    }

    @And("verify {string} button is displayed")
    public void verifyButtonIsDisplayed(String btn) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btn))));
    }

    @Then("verify {string} button is not displayed")
    public void verifyButtonIsNotDisplayed(String feature) {
        BrowserUtils.assertFalse(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, feature))).isEnabled());
    }
}


