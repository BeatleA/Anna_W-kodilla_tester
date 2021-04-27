package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(int numberOfCashMachines) {
        cashMachines = new CashMachine[numberOfCashMachines];
        for (int i=0; i < numberOfCashMachines; i++){
            cashMachines[i] = new CashMachine();
        }
    }

    public void makeTransaction(int machineNo, double amount){
        if (machineNo >=0 && machineNo < cashMachines.length) {
            cashMachines[machineNo].makeTransaction(amount);
        } else {
            System.out.println("Please enter correct cash machine number.");
        }
    }

    public double getBalance(){
        double balance = 0.0;
        for(int i = 0; i < this.cashMachines.length; i++) {
            balance += this.cashMachines[i].getBalance();
        }
        return balance;
    }

    public int getNumberOfDeposits(){
        int deposits = 0;
        for(int i = 0; i < this.cashMachines.length; i++) {
            deposits += this.cashMachines[i].getNumberOfDeposits();
        }
        return deposits;
    }

    public int getNumberOfWithdrawals(){
        int withdrawals = 0;
        for(int i = 0; i < this.cashMachines.length; i++) {
            withdrawals += this.cashMachines[i].getNumberOfWithdrawals();
        }
        return withdrawals;
    }

    public double getWithdrawalAverage(){
        if (this.cashMachines.length > 0) {
            double average;
            double totalAverage = 0.0;
            int count = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                average = this.cashMachines[i].getWithdrawalAverage();
                if (average != 0.0){
                    totalAverage += average;
                    count++;
                }
            }
            if (count > 0) {
                return totalAverage / count;
            }
        }
        return 0.0;
    }

    public double getDepositAverage(){
        if (this.cashMachines.length > 0) {
            double average;
            double totalAverage = 0.0;
            int count = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                average = this.cashMachines[i].getDepositAverage();
                if (average != 0.0){
                    totalAverage += average;
                    count++;
                }
            }
            if (count > 0) {
                return totalAverage / count;
            }
        }
        return 0.0;
    }
}
