package com.kodilla.bank.homework;

public class CashMachine {

    private double[] transactions;
    private int noOfTransactions;
    private int noOfDeposits = 0;
    private int noOfWithdrawals = 0;

    public CashMachine(){
        this.transactions = new double[0];
    }

    public void makeTransaction(double amount){
        if (amount == 0.0) {
            System.out.println("Please enter the correct amount.");
        } else if (amount < 0.0 && !hasEnough(amount)){
            System.out.println("There is not enough money in this cash machine for the requested withdrawal.");
        } else {
            this.noOfTransactions++;
            double[] newTab = new double[this.noOfTransactions];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.noOfTransactions - 1] = amount;
            this.transactions = newTab;
            if (amount > 0.0) {
                this.noOfDeposits++;
            } else {
                this.noOfWithdrawals++;
            }
        }
    }

    public double getBalance(){
        double balance = 0.0;
        for(int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }

    public int getNumberOfTransactions(){

        return this.transactions.length;
    }

    public int getNumberOfDeposits() {
        return this.noOfDeposits;
    }

    public int getNumberOfWithdrawals() {
        return this.noOfWithdrawals;
    }

    public double getWithdrawalAverage(){
        if (noOfWithdrawals > 0) {
            double average = 0.0;
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] < 0) {
                    average += this.transactions[i];
                }
            }
            return average / noOfWithdrawals;
        }
        else {
            return 0.0;
        }
    }

    public double getDepositAverage(){
        if (noOfDeposits > 0) {
            double average = 0.0;
            for (int i = 0; i < this.transactions.length; i++) {
                if (this.transactions[i] > 0) {
                    average += this.transactions[i];
                }
            }
            return average / noOfDeposits;
        } else {
            return 0.0;
        }
    }

    private boolean hasEnough(double amount){
        return getBalance() >= Math.abs(amount);
    }
}
