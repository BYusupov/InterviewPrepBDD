package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.List;

public class HomeSteps implements CommonPage {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }


    @Given("User opens Url")
    public void userOpensUrl() {
        BrowserUtils.getDriver();
    }

    @Then("Verify link text {string} is displayed")
    public void verifyLinkTextIsDisplayed(String dashboardBtns) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_BUTTON, dashboardBtns))));
    }
}

