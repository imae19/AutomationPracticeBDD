package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OthersPage;
import utils.BrowserUtils;

public class OthersSteps {
    OthersPage page;

    public OthersSteps(){
        page = new OthersPage();
    }

    @Then("Verify button is disable")
    public void verify_button_is_disable() {
       BrowserUtils.assertTrue(BrowserUtils.isDisabled(page.statusBtn));
    }
}