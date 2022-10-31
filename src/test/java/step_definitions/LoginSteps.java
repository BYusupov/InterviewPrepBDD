package step_definitions;


import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;



public class LoginSteps implements CommonPage {
    LoginPage page;

    public LoginSteps() {
        page = new LoginPage();
    }


    @Given("User opens Url")
    public void userOpensUrl() {
        BrowserUtils.getDriver();
    }
    @When("user enters {string} as {string}")
    public void user_enters_as(String value, String placeHolder) {
        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, placeHolder))), value);
    }


    @When("user clicks {string} button")
    public void user_clicks_button(String logInBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, logInBtn))));

    }

        public void user_clicks_button (String logInBtn){
            BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON,logInBtn))));
        }
        @Then("verify the title of the page")
        public void verify_the_title_of_the_page () {
            BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "Interview App");
        }


}


    @Then("verify the title of the page")
    public void verify_the_title_of_the_page() {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "Interview App");
    }

}





    }

    @Then("verify the title of the page")
    public void verify_the_title_of_the_page() {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), "Interview App");
    }



}



