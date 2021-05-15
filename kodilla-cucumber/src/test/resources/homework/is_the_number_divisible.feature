Feature: Is the number divisible?
  Checking divisibility by 3 and 5

  Scenario Outline: Number is divisible by 3,5,both or none
    Given Number is <value>
    When I ask if it's divisible by 3,5,both or none
    Then I should be answered <answer>
    Examples:
      | value | answer     |
      | 9     | "Fizz"     |
      | 20    | "Buzz"     |
      | 30    | "FizzBuzz" |
      | 7     | "None"     |
      | 8     | "None"     |
      | 13    | "None"     |
      | 185   | "Buzz"     |
      | 270   | "FizzBuzz" |
      | 18    | "Fizz"     |
      | 300   | "FizzBuzz" |
