package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
        System.out.println("open homepage");
    }

    @When("I capture text of the header")
    public void i_capture_text_of_the_header() {
        System.out.println("capture header on home page");
    }

    @Then("Verify header text is Automation with Selenium")
    public void verify_header_text_is_automation_with_selenium() {
        System.out.println("Verified header is Automation with Selenium");
    }

    @Then("Verify button Home is displayed")
    public void verify_button_home_is_displayed() {
        System.out.println("Tested Home button is displayed");
    }

    @Then("Verify button Calendar is displayed")
    public void verify_button_calendar_is_displayed() {
        System.out.println("Tested Calendar button is displayed");
    }

    @Then("Verify button UserMgt is displayed")
    public void verify_button_user_mgt_is_displayed() {
        System.out.println("Tested UserMgt button is displayed");
    }

    @Then("Verify button Others is displayed")
    public void verify_button_others_is_displayed() {
        System.out.println("Tested Others button is displayed");
    }

    @When("I click a button Others")
    public void i_click_a_button_others() {
        System.out.println("Clicked on Others page button");
    }
}
