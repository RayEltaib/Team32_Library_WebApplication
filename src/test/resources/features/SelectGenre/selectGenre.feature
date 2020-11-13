
Feature: Change to the selected genre

  @genre
  Scenario: Genre selection

    Given user is on login page
    When user logs in
    And user click on a Book Categories dropdown
    And user select one genre.
    Then the category table show change to the selected genre.