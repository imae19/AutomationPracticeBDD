package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class PopUpPage {

    public PopUpPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/nav[1]/a[8]")
    public WebElement popUpBtn;

    @FindBy (xpath = "//button[text()='Message']")
    public WebElement msgBtn;

    @FindBy(id = "exampleModalLabel")
    public WebElement headerNewMsg;

    @FindBy(id = "staticBackdropLabel")
    public WebElement headerBMICalc;

    @FindBy (id="exampleModalLabel")
    public WebElement pageTitle;

    @FindBy (xpath = "//button[text()='BMI Calculator']")
    public WebElement bmiBtn;

    @FindBy (id="bmi_btn")
    public WebElement bmiTitle;
}
