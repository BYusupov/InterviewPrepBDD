package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;


public class AdminUserPage {
    public AdminUserPage(){

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }


    @FindBy(xpath = "//button[contains(@class, 'btn-outline-danger')]")
    public List<WebElement> deleteBtns;

    @FindBy(xpath = "//button[contains(@class, 'btn-sm-outline-warning')]")
    public List<WebElement> editBtns;

    @FindBy(id = "Role")
    public WebElement roleInput;

    @FindBy(id = "Batch")
    public WebElement batchInput;

}
