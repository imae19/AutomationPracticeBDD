package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CalendarPage;
import pages.CommonPage;
import pages.HomePage;
import pages.UserMgtPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class UserMgtSteps implements CommonPage {
    UserMgtPage page;

    public UserMgtSteps() {
        page = new UserMgtPage();
    }

//    @When("I click a button User-Mgt")
//    public void i_click_a_button_user_mgt() {
//        BrowserUtils.click(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, "User-Mgt"))));
//    }

    @Then("Verify header title of the page is {string}") // came out as String cuz on userMgt.feature had test step as String "Register New User" in blue
    public void verify_header_title_of_the_page_is(String string) {
        BrowserUtils.assertEquals(page.headerTitle.getText(), "Register New User");
       // BrowserUtils.closeDriver(); -->> don't need this cuz created @after method on Hooks class to quit all drivers
    }

    @Then("Verify Login button is present")
    public void verify_login_button_is_present() {
        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.loginBtn));
    }

    @Then("Verify Access DB button is present")
    public void verify_access_db_button_is_present() {
        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.accessDBBtn));
    }

//    @Then("Verify First Name is present")
//    public void verify_first_name_is_present() {
//        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD,"First Name"))));
//    }

//    @Then("Verify Last Name is present")
//    public void verify_last_name_is_present() {
//        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD,"Last Name"))));
//    }
//
//    @Then("Verify Phone Number is present")
//    public void verify_phone_number_is_present() {
//        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD,"Phone Number"))));
//    }
//
//    @Then("Verify E-mail is present")
//    public void verify_e_mail_is_present() {
//        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
//                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD,"E-mail"))));
//    }

    @Then("Verify {string} is present")
    public void verifyIsPresent(String inputFiled) {
        BrowserUtils.isDisabled(BrowserUtils.getDriver().findElement(
                By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD,inputFiled))));
    }

    @Then("Verify {string} input field is displayed")
    public void verifyInputFieldIsDisplayed(String inputField) {
        BrowserUtils.isDisplayed(
                BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, inputField))
                )
        );
    }

    @Then("Verify following input fields are displayed:")
    public void verify_following_input_fields_are_displayed(List<String> dataTable) {
        for(String each : dataTable )
            BrowserUtils.isDisplayed(
                    BrowserUtils.getDriver().findElement(
                            By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, each))
                    )
            );
    }

    @When("I fill out user registration form with following info:")
    public void iFillOutUserRegistrationFormWithFollowingInfo(Map<String, String> map) {
        for(String key: map.keySet()){
            if (key.equalsIgnoreCase("role")){
                BrowserUtils.selectByVisibleText(page.selectRole, map.get(key));
            }else {
                BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(
                        String.format(XPATH_TEMPLATE_INPUT_FIELD, key)
                )), map.get(key));
            }
        }
    }

}






