package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CodingPage;
import pages.CommonPage;
import utils.BrowserUtils;

public class CodingSteps implements CommonPage {
    CodingPage page;

    public CodingSteps() {
        this.page = new CodingPage();
    }

    @Then("verify question {string} is displayed")
    public void verifyQuestionIsDisplayed(String question) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, question))));

    }

}
