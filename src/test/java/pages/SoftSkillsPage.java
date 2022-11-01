package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SoftSkillsPage {
    public SoftSkillsPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchbox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;
}
