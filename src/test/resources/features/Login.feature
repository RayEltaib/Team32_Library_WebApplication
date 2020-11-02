Feature : Login

  @Login
  Scenario: User logs in
    Given user is on login page
    When user logs in
    Then user should see "Library" page title
