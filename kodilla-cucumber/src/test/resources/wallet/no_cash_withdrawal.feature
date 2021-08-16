Feature: Prevent users from taking out more money than their wallet contains
  Scenario Outline: User tries to take out more money than their balance
    Given there is $<deposit> in my wallet
    When I request $<withdrawal>
    Then nothing should be dispensed
    And I should be told: <answer>
    Examples:
      | deposit | withdrawal | answer                 |
      | 100     | 200        | "Insufficient balance" |
      | 200     | 300        | "Insufficient balance" |
      | 200     | 201        | "Insufficient balance" |
      | 10      | -1         | "Incorrect amount"     |
      | 100     | 0          | "Incorrect amount"     |

  Scenario Outline: User tries to take out money from an empty wallet
    Given there is no money in my wallet
    When I request $<withdrawal>
    Then nothing should be dispensed
    And I should be told: <answer>
    Examples:
      | withdrawal | answer                 |
      | 30         | "Insufficient balance" |
      | 200        | "Insufficient balance" |
      | 1          | "Insufficient balance" |
