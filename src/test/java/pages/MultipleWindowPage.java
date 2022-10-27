package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MultipleWindowPage {

    public MultipleWindowPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//nav/a[text()='Multiple-window']")
    public WebElement multipleWindowBtn;

    @FindBy(xpath = "//a[text()='Launch TLA']")
    public WebElement launchTLAText;

    @FindBy(xpath = "//a[text()='Launch TLA']")
    public WebElement launchGoogleText;

    @FindBy(xpath = "//a[text()='Launch Facebook']")
    public WebElement launchFacebookText;

}
