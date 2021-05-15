Feature: Display balance

  Scenario: User checks the balance of their wallet
    Given I have deposited $200 in my wallet
    When I check the balance of my wallet
    Then I should see the balance of my wallet is $200

