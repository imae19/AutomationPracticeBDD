package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class UserPage {
    public UserPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy (tagName = "h1")
    public WebElement header;
}
