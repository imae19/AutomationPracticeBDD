package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.UserPage;
import utils.BrowserUtils;

public class UserSteps implements CommonPage {
    UserPage page;

    public UserSteps() {
        page = new UserPage();
    }

    @When("I fill out input fields with following info {string} and {string}")
    public void i_fill_out_input_fields_with_following_info_and(String username, String password) {
        BrowserUtils.switchToNewWindow();

        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Username"))), username);

        BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, "Enter Password"))), password);
    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String header) {
        BrowserUtils.assertEquals(BrowserUtils.getText(page.header), header);
    }
}
