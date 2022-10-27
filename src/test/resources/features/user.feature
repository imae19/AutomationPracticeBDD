Feature: User page test

  Background: Navigate to User-Mgt page
    Given I open url of homepage
    When I click nav button "User-Mgt"

  @US1901
  Scenario Outline: I need to see portal name based on who logs in to the system
    When I click link text "LOGIN"
    When I fill out input fields with following info "<UserName>" and "<Password>"
    And I click a button "Login"
    Then Verify "<Header>" is displayed
    Examples:
      | UserName                      | Password            | Header            |
      | queen.rhaenyra@7kingdoms.rule | rhaenyra.targaryen$ | Instructor Portal |
      | prince.daemon@7kingdoms.rule  | daemon.targaryen$   | Mentor Portal     |
      | king.aegon@7kingdoms.rule     | aegon.targaryen$    | Student Portal    |
