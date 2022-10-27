Feature: Multiple Window page tests

  Background:
    Given I open url of homepage
    When I click nav button "Multiple-window"

  @US9001
  Scenario: verify following buttons are enabled
    Then Verify "Launch TLA" is enabled
    Then Verify "Launch Google" is enabled
    Then Verify "Launch Facebook" is enabled

  @US9001b
  Scenario: verify following buttons are enabled 2
    Then Verify following buttons are displayed:
      | Launch TLA      |
      | Launch Google   |
      | Launch Facebook |

  @US9001c
  Scenario Outline: verify following buttons are enabled with scenario outline
    Given I open url of homepage
    Then Verify button "<button>" is displayed
    Examples:
      | button          |
      | Launch TLA      |
      | Launch Google   |
      | Launch Facebook |
