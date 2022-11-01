package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.ManageAccessPage;
import utils.BrowserUtils;

import java.util.List;


public class ManageAccessSteps implements CommonPage {
    ManageAccessPage page;

    public ManageAccessSteps() {

        page = new ManageAccessPage();
    }

    @Then("Verify following options are displayed:")
    public void verifyFollowingOptionsAreDisplayed(List<String> dataTable) {
        for (String each : dataTable) {
            if (each.equalsIgnoreCase("all")) {
                BrowserUtils.isDisplayed(page.selectFilter);
            }
        }
    }
    @When("user clicks on a button Action")
    public void userClicksOnAButtonAction() {
        BrowserUtils.click(page.actionBtn);
    }

    @Then("Verify following buttons are displayed:")
    public void verifyFollowingButtonsAreDisplayed(List<String> dataTable) {
        for (String each : dataTable) {
            BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
                    By.xpath(String.format(XPATH_TEMPLATE_BUTTON, each))));
        }
    }
}
