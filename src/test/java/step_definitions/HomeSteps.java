package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.jce.provider.BrokenJCEBlockCipher;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage{
    HomePage page;
    CalendarPage calendarPage;
    PopUpPage popUpPage;
    MultipleWindowPage multipleWindowPage;

    public HomeSteps() {
        page = new HomePage();
        calendarPage = new CalendarPage();
        popUpPage = new PopUpPage();
        multipleWindowPage = new MultipleWindowPage();
    }

    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }

    @Then("Verify header text is {string}")
    public void verifyHeaderTextIs(String headerTxt) {
        WebElement element = null;

        switch (headerTxt.toLowerCase()) {
            case "automation with selenium":
                element = page.headerTitle;
                break;
            default:
                System.out.println("WebElement is not defined");
        }
        BrowserUtils.assertEquals(element.getText(), headerTxt);
    }

    @Then("Verify button {string} is displayed")
    public void verifyButtonIsDisplayed(String button) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, button)))
        );
    }


    //TODO: Update link text related steps with this new step
    @Then("Verify link text Home is displayed")
    public void verifyLinkTextHomeIsDisplayed() {

    }

    @When("I click a button {string}")
    public void iClickAButton(String button) {
        switch (button.toLowerCase()) {
            case "enddateinput":
                BrowserUtils.click(calendarPage.endDateInput);
                break;
            case "enddatecalendar":
                BrowserUtils.click(calendarPage.endDateCalendar);
                break;
            case "message":
                BrowserUtils.click(popUpPage.msgBtn);
                break;
            case "bmi calculator":
                BrowserUtils.click(popUpPage.bmiBtn);
                break;
            default:
                BrowserUtils.click(BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_BUTTON, button))));
        }
    }
    // this one is clicking User-Mgt button referred to userMgt.feature on Background
    @When("I click nav button {string}")
    public void iClickNavButton(String button) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, button))));
    }

    @When("I click link text {string}")
    public void iClickLinkText(String linkText) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.linkText(linkText)));

    }

    @Then("Verify destination window as url as {string}")
    public void verifyDestinationWindowAsUrlAs(String URL) {
        BrowserUtils.switchToNewWindow();
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), URL);
    }


}


