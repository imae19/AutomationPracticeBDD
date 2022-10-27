package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CalendarPage;
import pages.CommonPage;
import pages.MultipleWindowPage;
import utils.BrowserUtils;

import javax.sql.CommonDataSource;
import java.util.List;

public class MultipleWindowSteps implements CommonPage {
    MultipleWindowPage page;

    public MultipleWindowSteps(){
        this.page = new MultipleWindowPage();
    }


//    @When("I click a button Multiple-window")
//    public void i_click_a_button_multiple_window() {
//       BrowserUtils.click(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Multiple-window"))));
//    }
//    @Then("Verify Launch TLA is enabled")
//    public void verify_launch_tla_is_enabled() {
//        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Launch TLA"))));
//    }
//    @Then("Verify Launch Google is enabled")
//    public void verify_launch_google_is_enabled() {
//        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Launch Google"))));
//    }
//    @Then("Verify Launch Facebook is enabled")
//    public void verify_launch_facebook_is_enabled() {
//        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "Launch Facebook"))));
//    }

    @Then("Verify {string} is enabled")
    public void verifyIsEnabled(String launchTxt) {
        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, launchTxt))));
    }

    @Then("Verify following buttons are displayed:")
    public void verify_following_buttons_are_displayed(List<String> dataTable) {
        for(String each : dataTable )
        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, each))));
    }
}
