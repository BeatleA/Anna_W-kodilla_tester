Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $<deposit> in my wallet
    When I request $<withdrawal>
    Then $<withdrawal> should be dispensed
    And Answer should be "Successful withdrawal"
    Examples:
    | deposit | withdrawal |
    | 200 | 30 |
    | 350 | 140 |
    | 300 | 300 |
    | 10 | 9 |

  Scenario Outline: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $<deposit> in my wallet
    When I request $<withdrawal>
    Then Answer should be <answer>
    Examples:
      | deposit | withdrawal | answer |
      | 200 | 300 | "Insufficient balance" |
      | 200 | 201 | "Insufficient balance" |
      | 10 | -1 | "Incorrect amount"              |
      | 100 | 0  | "Incorrect amount"             |

  Scenario Outline: Unsuccessful withdrawal from a wallet not in credit
    Given I have not deposited anything in my wallet
    When I request $<withdrawal>
    Then Answer should be "Insufficient balance"
    Examples:
      | withdrawal |
      | 30 |
      | 200 |
      | 1 |
