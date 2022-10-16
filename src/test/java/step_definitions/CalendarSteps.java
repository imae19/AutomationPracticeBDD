package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarSteps {

    @When("I click a button end date Input")
    public void i_click_a_button_end_date_input() {
        System.out.println("Clicked a button end date Input");
    }

    @When("I click a button end date calendar")
    public void i_click_a_button_end_date_calendar() {
        System.out.println("Clicked a button end date calendar");
    }

    @When("I click a button submit")
    public void i_click_a_button_submit() {
        System.out.println("Clicked a button submit");
    }

    @Then("Verify there are {int} days between startDate and endDate")
    public void verify_there_are_days_between_start_date_and_end_date(Integer int1) {
        System.out.println("Verify there are {int} days between startDate and endDat");
    }
}