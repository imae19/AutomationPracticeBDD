Feature: Inputs page tests

  Background: Navigate to inputs page
    Given I open url of homepage
    When I click nav button "Inputs"

  @US4051
  Scenario: Contact Us form test
    When I fill out contact us form with following details:
      | first_name | May          |
      | last_name  | Chaijan      |
      | email      | Mc@home.com  |
      | phone      | 703-255-7029 |
      | address    | 111 Main ave |
      | city       | Fairfax      |
      | state      | Virginia     |
      | zip        | 22033        |
    When I click a button "Send"
    Then Verify text "Thanks for contacting us, we will get back to you shortly." is displayed