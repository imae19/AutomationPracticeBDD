package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.UnreachableBrowserException;
import pages.PopUpPage;
import pages.UserMgtPage;
import utils.BrowserUtils;

public class PopUpSteps {
    PopUpPage page;
    public PopUpSteps() {
        page = new PopUpPage();
    }

//    @When("I click a button Message")
//    public void i_click_a_button_message() {
//        BrowserUtils.click(page.msgBtn);
//    }
//    @Then("Verify header title of the page is New Message")
//    public void verify_header_title_of_the_page_is_new_message() {
//        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.pageTitle));
//    }
//    @When("I click a button BMI Calculator")
//    public void i_click_a_button_bmi_calculator() {
//        BrowserUtils.click(page.bmiBtn);
//    }
//    @Then("Verify header title of the page is BMI Calculator")
//    public void verify_header_title_of_the_page_is_bmi_calculator() {
//        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.bmiTitle));
//    }
//}


    @Then("Verify header New Message is displayed")
    public void verifyHeaderNewMessageIsDisplayed() {
        BrowserUtils.assertEquals(BrowserUtils.getText(page.headerNewMsg), "New message");
    }

    @Then("Verify header BMI Calculator is displayed")
    public void verifyHeaderBMICalculatorIsDisplayed() {
        BrowserUtils.assertEquals(BrowserUtils.getText(page.headerBMICalc), "BMI Calculator");
    }
}