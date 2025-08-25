Feature: User registration

  Scenario: Register multiple users
    Given the following user data:
      | name   | age | email              |
      | Scott  | 20  | scottexample.com  |
      | Martin | 25  | martin@example.com |
      | Karen  | 30  | karen@example.com  |
      | Smith  | 29  | smith@examplecom  |
    When I process the user data
    Then I should have 3 users
    And all emails should contain "@"
    And all emails should contain "."
