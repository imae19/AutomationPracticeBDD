Feature: Calendar page tests

  @US1015 @smoke @regression
  Scenario: Choosing date from calendar
    Given I open url of homepage
    When I click nav button "Calendar"
    When I click a button "endDateInput"
    When I click a button "endDateCalendar"
    When I click a button "Submit"
    Then Verify there are 1 days between startDate and endDate



