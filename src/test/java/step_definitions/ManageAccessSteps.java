package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.AdminUserPage;
import pages.CommonPage;
import pages.ManageAccessPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class ManageAccessSteps implements CommonPage {
    ManageAccessPage page;

    public ManageAccessSteps(){

        page = new ManageAccessPage();
    }

    @Given("Admin User opens URL")
    public void adminUserOpensUrl() {
        BrowserUtils.getDriver();
    }

    @And("user clicks {string} button")
    public void userClicksButton(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, button))));
    }

    @Then("I click {string} button")
    public void iClickButton(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, button))));
    }
    @Then("Verify following options are displayed:")
    public void verifyFollowingOptionsAreDisplayed(List<String> dataTable) {
        for(String each: dataTable){
            if (each.equalsIgnoreCase("all")) {
                BrowserUtils.isDisplayed(page.selectFilter);
            }
        }

    }
}
