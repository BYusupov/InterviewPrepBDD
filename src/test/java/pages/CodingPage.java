package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CodingPage {
    public CodingPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//p[contains(text(), 'Array')]/following::button[1]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//p[contains(text(), 'Array')]/following::button[2]")
    public WebElement editBtn;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-success']")
    public WebElement checkBtn;

}
