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

    @And("user clicks delete {string} question")
    public void userClicksDeleteArrayReverseQuestion(String question) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_DELETE_BUTTON_WITH_QUESTIONS,question))));
    }


//    @When("user clicks edit Array reverse of question")
//    public void user_clicks_edit_array_reverse_of_question() {
//        BrowserUtils.click(page.editBtn);
//    }

    @And("user clicks on textbox")
    public void userClicksOnTexbox() {
        BrowserUtils.click(page.textBox);
    }

    @And("user deletes existing question")
    public void userDeletesExistingQuestion() {

        BrowserUtils.selectAllText(page.textBox);
        page.textBox.sendKeys(Keys.CLEAR);
    }

    @And("user edits question {string}")
    public void userEditsQuestionAs(String value) {
        BrowserUtils.sendKeys(page.textBox, value);
    }

    @And("user clicks check button")
    public void userClicksCheckButton() {
        BrowserUtils.click(page.checkBtn);
    }


    @And("user clicks edit {string} question")
    public void userClicksEditQuestion(String question) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_EDIT_BUTTON_WITH_QUESTIONS,question))));
    }
}


