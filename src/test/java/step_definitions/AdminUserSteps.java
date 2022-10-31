package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminUserPage;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class AdminUserSteps implements CommonPage {

    AdminUserPage page;

    public AdminUserSteps(){

        page = new AdminUserPage();
    }

    @Given("Admin User opens URL")
    public void adminUserOpensUrl() {
        BrowserUtils.getDriver();
    }

    @When("Admin User enters {string} as {string}")
    public void adminUserEntersAs(String value, String placeHolder) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath
                (String.format(XPATH_TEMPLATE_INPUT_FIELD, placeHolder))), value);
    }

    @And("Admin User clicks {string} button")
    public void adminUserClicksButton(String logInBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_BUTTON, logInBtn))));
    }

    @Then("Verify {string} button is displayed")
    public void verifyButtonIsDisplayed(String button) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, button)))
        );
    }

    @When("I add a new dashboard {string} as {string}")
    public void iAddANewDashboardAs(String topic, String newDashboard) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath
                (String.format(XPATH_TEMPLATE_INPUT_FIELD, newDashboard))), topic);
    }

    @Then("I click {string} button")
    public void iClickButton(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, button))));
    }

    @Then("Verify following input fields are displayed:")
    public void verifyFollowingInputFieldsAreDisplayed(List<String> dataTable) {
        for(String each: dataTable){
            if (each.equalsIgnoreCase("role")) {
                BrowserUtils.isDisplayed(page.roleInput);
            } else if (each.equalsIgnoreCase("batch")) {
                BrowserUtils.isDisplayed(page.batchInput);
            } else {
                BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, each))));
            }
        }
    }

    @Then("I fill out new user form with following info:")
    public void iFillOutNewUserFormWithFollowingInfo(Map<String, String> map) {
        for (String key : map.keySet()) {
            if (key.equalsIgnoreCase("role")) {
                BrowserUtils.selectByVisibleText(page.roleInput, map.get(key));
            } else if (key.equalsIgnoreCase("batch")) {
                BrowserUtils.selectByVisibleText(page.batchInput, map.get(key));
            } else {
                BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                        String.format(XPATH_TEMPLATE_INPUT_FIELD, key)
                )), map.get(key));
            }
        }
    }


    @Then("Verify Edit button {string} is clickable")
    public void verifyEditButtonIsClickable(String button) {
        BrowserUtils.isClickable(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_CLASS_CONTAINS, button))));
    }

    @Then("Verify Delete button {string} is clickable")
    public void verifyDeleteButtonIsClickable(String button) {
        BrowserUtils.isClickable(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_CLASS_CONTAINS, button))));
    }


    @Then("I verify that added user is displayed with following info:")
    public void iVerifyThatAddedUserIsDisplayedWithFollowingInfo(List<String> names) {
        for(String each: names){
            BrowserUtils.isDisplayed(
                    BrowserUtils.getDriver().findElement(
                            By.xpath(String.format(XPATH_TEMPLATE_TEXT, each))
                    )
            );
        }
    }
}
