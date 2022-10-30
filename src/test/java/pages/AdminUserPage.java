package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AdminUserPage {
    public AdminUserPage(){

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

}
