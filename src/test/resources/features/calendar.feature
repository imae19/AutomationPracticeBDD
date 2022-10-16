Feature: Calendar page tests
  Scenario: US1015: Choosing date from calendar
    Given I open url of homepage
    When I click a button calendar
    When I click a button end date Input
    When I click a button end date calendar
    When I click a button submit
    Then Verify there are 1 days between startDate and endDate

  Scenario: US1015: Choosing date from calendar(Short Version)
    Given I open url of homepage
    When I click a button calendar
    When I click a button end date Input
    When I click a button end date calendar
    When I click a button submit
    Then Verify there are 1 days between startDate and endDate

