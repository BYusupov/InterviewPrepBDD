package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ManageAccessPage {
    public ManageAccessPage(){

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(id = "Select-filter")
    public WebElement selectFilter;

    @FindBy(xpath = "(//button[@id='dropdownMenu2'])[1]")
    public WebElement actionBtn;
}
