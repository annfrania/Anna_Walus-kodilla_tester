Feature: Is it Summer?
  Everybody likes Summer

  Scenario Outline: Today is or isn't Summer
    Given today is <day>
    When I ask whether it's Summer
    Then I should be told <answer>
    Examples:
      | day                   | answer |
      | last day of December  | "NOPE" |
      | second day of January | "NOPE" |
      | 10th day of February  | "NOPE" |
      | 20th day of June      | "NOPE" |
      | 5th day of May        | "NOPE" |
      | 24th day of September | "NOPE" |
      | first day of August   | "YES"  |
      | 21th day of June      | "YES"  |
      | 23th day of August    | "YES"  |
