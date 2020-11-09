Feature: Borrowing book
  Background: Login
    Given user is on login page

  @BorrowBookBtn
  Scenario: when user borrows book, "Borrow Book" button should become disabled
    Given I log in as a student
    When I borrow a book
    Then the system should disable that book's borrow book button