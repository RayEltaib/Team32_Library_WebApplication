Feature: BorrowBook

  @BorrowBook
  Scenario: user borrows book
    Given as a library member.
    When a member click the "borrow book" button.
    Then system should show conformation message.
