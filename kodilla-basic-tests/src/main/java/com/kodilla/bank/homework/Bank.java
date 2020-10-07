package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;

    public Bank(){
        this.cashMachine1 = new CashMachine();
        this.cashMachine2 = new CashMachine();
        this.cashMachine3 = new CashMachine();
    }
    public int totalBalance() {
        int total = this.cashMachine1.getBalance() + this.cashMachine2.getBalance() + this.cashMachine3.getBalance();
        return total;// pętla for
    }

    public int numberOfWithdrawals (int values) {
       int countW = 0;
       if (values < 0) {
           return 1;
       }
       for (int i = 0; i < cashMachine1.getSize(); i++){
       countW++;
       return countW;}
    }
    public int numberOfDeposits (int values) {
        int count = 0;
        if (values > 0) {
            return count++;
        }
    }
    public double averageWithdrawal(int values) {
        int countW;
        double sumWithdrawals = 0;
        if (values < 0) {
            for (int i = 0; i < values.length; i++){
               sumWithdrawals = sumWithdrawals + this.values[i];
            }
            return sumWithdrawals/countW;
        }
    }
    }

}
