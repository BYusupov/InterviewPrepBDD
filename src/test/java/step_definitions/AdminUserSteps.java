package step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.AdminUserPage;
import pages.CommonPage;
import utils.BrowserUtils;

import java.util.Map;

public class AdminUserSteps implements CommonPage {

    AdminUserPage page;

    public AdminUserSteps(){
        page = new AdminUserPage();
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


    @Then("I fill out new user form with following info:")
    public void iFillOutNewUserFormWithFollowingInfo(Map<String, String> map) {
        for (String key : map.keySet()) {

            if (key.equalsIgnoreCase("role")) {
                BrowserUtils.selectByVisibleText(page.roleInput, map.get(key));
            } else if (key.equalsIgnoreCase("batch")) {
                BrowserUtils.selectByVisibleText(page.batchInput, map.get(key));
            } else {
                BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, key))), map.get(key));
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

    @Then("Verify following {string} and {string} are displayed:")
    public void verifyFollowingAndAreDisplayed(String input, String select) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, input))));
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.id(select)));

    }

}
