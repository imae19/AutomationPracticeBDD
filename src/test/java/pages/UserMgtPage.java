package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class UserMgtPage {
    public UserMgtPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//nav/a[text()='User-Mgt']")
    public WebElement userMgtBtn;

    @FindBy(tagName = "h2")
    public WebElement headerTitle;

    @FindBy (id = "practice-form") //(xpath = "//button/a[text()='Login']")
    public WebElement loginBtn;

    @FindBy (id = "access-db-btn")
    public WebElement accessDBBtn;

    @FindBy (id ="select-role")
    public WebElement selectRole;

//    @FindBy (xpath = "//input[@placeholder='First Name']")
//    public WebElement firstName;
//
//    @FindBy (xpath = "//input[@placeholder='Last Name']")
//    public WebElement lastName;
//
//    @FindBy (xpath = "//input[@placeholder='Phone Number']")
//    public WebElement phoneNumber;
//
//    @FindBy (xpath = "//input[@placeholder='E-mail']")
//    public WebElement Email;
}
