Feature: Home page tests
  Scenario: US1021 - Test header of the home page
    Given I open url of homepage
    When I capture text of the header
    Then Verify header text is Automation with Selenium

  Scenario: US1022 - Test nav buttons are displayed
    Given I open url of homepage
    Then Verify button Home is displayed
    Then Verify button Calendar is displayed
    Then Verify button UserMgt is displayed
    Then Verify button Others is displayed