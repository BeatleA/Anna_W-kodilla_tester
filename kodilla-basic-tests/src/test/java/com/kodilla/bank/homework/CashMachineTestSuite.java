package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine;
    int noOfDeposits;
    int noOfWithdrawals;
    int noOfTransactions;
    double balance;
    double withdrawalAverage;
    double depositAverage;

    @Test
    public void shouldHaveZeroTransactionsAndBalance() {
        cashMachine = new CashMachine();
        noOfDeposits = cashMachine.getNumberOfDeposits();
        noOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        noOfTransactions = cashMachine.getNumberOfTransactions();
        balance = cashMachine.getBalance();
        assertEquals(0,balance,0.01);
        assertEquals(0,noOfDeposits);
        assertEquals(0,noOfWithdrawals);
        assertEquals(0,noOfTransactions);
    }

    @Test
    public void shouldHaveZeroTransactionsIfWithdrawalBeforeDeposits() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(-20);
        noOfDeposits = cashMachine.getNumberOfDeposits();
        noOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        noOfTransactions = cashMachine.getNumberOfTransactions();
        balance = cashMachine.getBalance();
        assertEquals(0,balance,0.01);
        assertEquals(0,noOfDeposits);
        assertEquals(0,noOfWithdrawals);
        assertEquals(0,noOfTransactions);
    }

    @Test
    public void shouldHaveOneDeposit() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(20);
        noOfDeposits = cashMachine.getNumberOfDeposits();
        noOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        noOfTransactions = cashMachine.getNumberOfTransactions();
        balance = cashMachine.getBalance();
        assertEquals(20,balance,0.01);
        assertEquals(1,noOfDeposits);
        assertEquals(0,noOfWithdrawals);
        assertEquals(1,noOfTransactions);
    }

    @Test
    public void shouldHaveZeroWithdrawalsIfWithdrawalBiggerThanDeposit() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(20);
        cashMachine.makeTransaction(-30);
        noOfDeposits = cashMachine.getNumberOfDeposits();
        noOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        noOfTransactions = cashMachine.getNumberOfTransactions();
        balance = cashMachine.getBalance();
        assertEquals(20,balance,0.01);
        assertEquals(1,noOfDeposits);
        assertEquals(0,noOfWithdrawals);
        assertEquals(1,noOfTransactions);
    }

    @Test
    public void shouldHaveOneDepositAndOneWithdrawal() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(30);
        cashMachine.makeTransaction(-20);
        noOfDeposits = cashMachine.getNumberOfDeposits();
        noOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        noOfTransactions = cashMachine.getNumberOfTransactions();
        balance = cashMachine.getBalance();
        assertEquals(10,balance,0.01);
        assertEquals(1,noOfDeposits);
        assertEquals(1,noOfWithdrawals);
        assertEquals(2,noOfTransactions);
    }

    @Test
    public void shouldHaveZeroBalanceIfWithdrawalEqualsDeposit() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(20);
        cashMachine.makeTransaction(-20);
        noOfDeposits = cashMachine.getNumberOfDeposits();
        noOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        noOfTransactions = cashMachine.getNumberOfTransactions();
        balance = cashMachine.getBalance();
        assertEquals(0,balance,0.01);
        assertEquals(1,noOfDeposits);
        assertEquals(1,noOfWithdrawals);
        assertEquals(2,noOfTransactions);
    }

    @Test
    public void shouldHaveCorrectBalanceAfterFiveValidTransactions() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(20);
        cashMachine.makeTransaction(-20);
        cashMachine.makeTransaction(50);
        cashMachine.makeTransaction(-10);
        cashMachine.makeTransaction(-5.5);
        noOfDeposits = cashMachine.getNumberOfDeposits();
        noOfWithdrawals = cashMachine.getNumberOfWithdrawals();
        noOfTransactions = cashMachine.getNumberOfTransactions();
        balance = cashMachine.getBalance();
        assertEquals(34.5,balance,0.01);
        assertEquals(2,noOfDeposits);
        assertEquals(3,noOfWithdrawals);
        assertEquals(5,noOfTransactions);
    }

    @Test
    public void shouldReturnWithdrawalAverageEqualsZeroIfNoTransactions() {
        cashMachine = new CashMachine();
        withdrawalAverage = cashMachine.getWithdrawalAverage();
        assertEquals(0,withdrawalAverage, 0.01);
    }

    @Test
    public void shouldReturnWithdrawalAverageEqualsZeroIfNoWithdrawals() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(300);
        withdrawalAverage = cashMachine.getWithdrawalAverage();
        assertEquals(0,withdrawalAverage, 0.01);
    }

    @Test
    public void shouldCalculateCorrectWithdrawalAverage() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(20);
        cashMachine.makeTransaction(-20);
        cashMachine.makeTransaction(50);
        cashMachine.makeTransaction(-10);
        cashMachine.makeTransaction(-5.5);
        withdrawalAverage = cashMachine.getWithdrawalAverage();
        assertEquals(-11.83,withdrawalAverage, 0.01);
    }

    @Test
    public void shouldReturnDepositAverageEqualsZeroIfNoTransactions() {
        cashMachine = new CashMachine();
        depositAverage = cashMachine.getDepositAverage();
        assertEquals(0,depositAverage, 0.01);
    }

    @Test
    public void shouldReturnDepositAverageEqualsZeroIfNoDeposits() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(-300);
        depositAverage = cashMachine.getDepositAverage();
        assertEquals(0,depositAverage, 0.01);
    }

    @Test
    public void shouldCalculateCorrectDepositAverage() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(21);
        cashMachine.makeTransaction(-20);
        cashMachine.makeTransaction(50.3);
        cashMachine.makeTransaction(-10);
        cashMachine.makeTransaction(-5.5);
        double depositAverage = cashMachine.getDepositAverage();
        assertEquals(35.65,depositAverage, 0.01);
    }
}
