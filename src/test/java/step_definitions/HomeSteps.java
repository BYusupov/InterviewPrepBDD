package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;
    LoginPage loginPage;


    public HomeSteps() {
        page = new HomePage();
        loginPage = new LoginPage();
    }

}

