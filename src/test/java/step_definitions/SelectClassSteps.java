package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.BrowserUtils;

public class SelectClassSteps implements CommonPage {

    @When("I click option {string}")
    public void i_click_option(String optionNum) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, optionNum))));
    }

//    @Then("Verify {string} is displayed")
//    public void verifyIsDisplayed(String optionNumDisplay) {
//        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, optionNumDisplay))));
//    }
}
