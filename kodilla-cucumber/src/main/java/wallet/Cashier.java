package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawal(Wallet wallet, int amount) {
        if (wallet.getBalance()>=amount) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }
        else reportNotEnoughMoney();
    }
    public String reportNotEnoughMoney (){
        //
        return "Not enough money in your wallet";
        }
    }
