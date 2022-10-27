Feature: Others page test

  @regression @US2001
  Scenario: Disabled button is working as expected
    Given I open url of homepage
    When I click a button "Others"
    Then Verify button is disable