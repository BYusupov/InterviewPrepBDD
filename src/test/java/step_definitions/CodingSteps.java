package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    @When("user adds question {string} as {string}")
    public void userAddsQuestionAs(String value, String placeholder) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXTAREA_FIELD, placeholder))), value);
    }

    @And("user clicks delete Array reverse question")
    public void userClicksDeleteArrayReverseQuestion() {
        BrowserUtils.click(page.deleteBtn);
    }

    @When("user clicks edit Array reverse of question")
    public void user_clicks_edit_array_reverse_of_question() {
        BrowserUtils.click(page.editBtn);
    }
//    @And("user deletes existing question {string}")
//    public void userDeletesExistingQuestion(String txt) {
//        BrowserUtils.sendKeys();
//    }

    @And("user edits question {string} as {string}")
    public void userEditsQuestionAs(String value, String txt) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXTAREA_TXT, txt))), value);
    }

    @And("user clicks check button")
    public void userClicksCheckButton() {
        BrowserUtils.click(page.checkBtn);
    }



}
