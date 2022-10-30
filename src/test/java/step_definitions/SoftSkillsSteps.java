package step_definitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.SoftSkillsPage;
import utils.BrowserUtils;

public class SoftSkillsSteps implements CommonPage {
    SoftSkillsPage page;

    public SoftSkillsSteps() {
        page = new SoftSkillsPage();
    }


    @And("user clicks on {string} button")
    public void user_clicks_on_button(String Softskills) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, Softskills))));
    }

    @And("user should be able to enter {string} in search and get related question")
    public void userShouldBeAbleToEnterInAndGetRelatedQuestion(String word) {
        BrowserUtils.sendKeys(page.searchbox, word);
        BrowserUtils.click(page.submit);
    }

    @And("verify the criteria is no more than {int} chars")
    public void verify_the_criteria_is_no_more_than_chars(Integer int1) {
        Assert.assertTrue(page.searchbox.getText()<=);
    }

    @And("Show all button should bring back all questions")
    public void show_all_button_should_bring_back_all_questions() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}

