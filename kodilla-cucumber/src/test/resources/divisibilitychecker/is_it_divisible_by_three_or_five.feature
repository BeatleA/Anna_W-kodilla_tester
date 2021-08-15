Feature: Is it divisible by 3 or 5?
  FizzBuzz game

  Scenario Outline: The number is or isn't divisible by 3 or 5
    Given number is <number>
    When I ask whether the number is divisible by 3 or 5
    Then returned text should be <answer>
    Examples:
      | number | answer |
      | 3 | "Fizz" |
      | 9 | "Fizz" |
      | 27 | "Fizz" |
      | 5 | "Buzz" |
      | 10 | "Buzz" |
      | 25 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 30 | "FizzBuzz" |
      | 7 | "None" |
      | 16 | "None" |