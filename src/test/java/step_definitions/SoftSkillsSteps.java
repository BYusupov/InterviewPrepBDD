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


    @And("user should be able to enter {string} in search and get related question")
    public void userShouldBeAbleToEnterInAndGetRelatedQuestion(String word) {
        BrowserUtils.sendKeys(page.searchbox, word);

        BrowserUtils.click(page.submit);
    }

    @And("verify the criteria {string} is no more than {int} chars")
    public void verifyTheCriteriaIsNoMoreThanChars(String word, int numberOfChars) {

        Assert.assertTrue(word.length() <= numberOfChars);

    }

    @And("user clicks on {string} button and should bring back all questions")
    public void userClicksOnButtonAndShouldBringBackAllQuestions(String btn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn))));

    }
}

