Feature: UserMgt page test
  Background: Navigate to User-Mgt page
    Given I open url of homepage
    When I click nav button "User-Mgt"

@US4001 @regression
Scenario: verify title of the page is "Register New User"
  Then Verify header title of the page is "Register New User"
  # this "Register New User" in blue is String

  @US4002 @regression
  Scenario: verify Login button is present
    Then Verify Login button is present

    @US4003 @regression
      Scenario: verify Access DB button is present
      Then Verify Access DB button is present

      @US4004
      Scenario: Verify following input fields are displayed on the page
        Then Verify "First Name" is present
        Then Verify "Last Name" is present
        Then Verify "Phone Number" is present
        Then Verify "E-mail" is present

        @US4004b
        Scenario: Verify following input fields are displayed on the page 2
          Then Verify following input fields are displayed:
          | First Name  |
          | Last Name   |
          | Phone Number|
          | E-mail      |

          @US4010
          Scenario: Add new User to staging table
            When I fill out user registration form with following info:
              | First Name  | John            |
              | Last Name   | Wick            |
              | Phone Number| 703-255-7029    |
              | E-mail      | j.wick@home.com |
              | role        | Student         |
            And I click a button "Submit"


