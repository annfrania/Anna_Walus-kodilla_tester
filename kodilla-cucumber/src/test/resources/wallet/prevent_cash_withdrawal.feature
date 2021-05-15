Feature: Prevent users from taking out more money than their wallet contents

  Scenario: User tries to take out more money than their balance
    Given I have deposited $200 in my wallet
    When I request $300
    Then Nothing should be dispensed
    And I should be told I don't have enough money in my wallet

  Scenario: User tries to take out money from an empty wallet
    Given I have deposited $0 in my wallet
    When I request $30
    Then Nothing should be dispensed
    And I should be told I don't have enough money in my wallet