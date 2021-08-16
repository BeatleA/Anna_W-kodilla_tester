Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given there is $<deposit> in my wallet
    When I request $<withdrawal>
    Then $<withdrawal> should be dispensed
    And the balance of my wallet should be $<balance>
    And I should be told: "Successful withdrawal"
    Examples:
    | deposit | withdrawal | balance |
    | 200 | 30 | 170 |
    | 350 | 140 | 210 |
    | 300 | 300 | 0 |
    | 10 | 9 | 1 |