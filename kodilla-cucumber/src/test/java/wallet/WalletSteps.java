package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200,wallet.getBalance());
        });
        Given("I have deposited $0 in my wallet", () -> {
            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance",0,wallet.getBalance());
        });

        When("I request $30", () -> {
           cashier.withdrawal(wallet,30);
        });
        When("I request $200", () -> {
            cashier.withdrawal(wallet,200);
        });
        When("I request $0", () -> {
            cashier.withdrawal(wallet,0);
        });
        When("I request $300", () -> {
            cashier.withdrawal(wallet,300);
        });
        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
        });

        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200,cashSlot.getContents());
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30,cashSlot.getContents());
        });
        Then("Nothing should be dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance",170,wallet.getBalance());
        });
        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance",0,wallet.getBalance());
        });
        Then("I should be told I don't have enough money in my wallet", () -> {
            Assert.assertEquals("Not enough money in your wallet",cashier.reportNotEnoughMoney());
        });
        Then("I should see the balance of my wallet is $200", () -> {
            Assert.assertEquals("Your current balance is $200",wallet.displayBalance());
        });
    }
}
