package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CodingPage {
    public CodingPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
