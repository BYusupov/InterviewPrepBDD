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


    @Then("Verify following options are displayed:")
    public void verifyFollowingOptionsAreDisplayed(List<String> dataTable) {
        for(String each: dataTable){
            if (each.equalsIgnoreCase("all")) {
                BrowserUtils.isDisplayed(page.selectFilter);
            }
        }

    }
}
