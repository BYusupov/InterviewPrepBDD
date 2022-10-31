package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ResetPage {
    public ResetPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
