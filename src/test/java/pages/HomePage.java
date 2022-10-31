package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(id = "sample")
    public WebElement sampleElement;

    @FindBy(id = "inputArea1")
    public WebElement inputField;

    @FindBy(xpath = "(//button[@class='btn btn-success badge-pill newbtn mb-3'])[2]")
    public WebElement dontBtn;

    @FindBy(id = "inputArea1")
    public WebElement doInput;

    @FindBy(id = "inputArea2")
    public WebElement dontInput;

    @FindBy(xpath = "(//button[text()='Enter'])[2]")
    public WebElement enterDontBtn;
}
