package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.AdminUserPage;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;

public class AdminUserSteps implements CommonPage {

    AdminUserPage page;

    public AdminUserSteps(){
        page = new AdminUserPage();
    }

    @When("admin user enters {string} as {string}")
    public void adminUserEntersAs(String value, String placeHolder) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, placeHolder))),value);
    }


    @Then("verify {string} button is visible")
    public void verifyButtonIsVisible(String button) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_TEXT, button)))
        );
    }
}
