Feature: Select-Class page test

  Background: Navigate to Select-class page
    Given I open url of homepage
    When I click nav button "Select-class"

  @US6021
  Scenario: Verify display as selected "You selected:one" or "You selected:Two"
    When I click option "One"
    Then Verify "You selected: One" is displayed

