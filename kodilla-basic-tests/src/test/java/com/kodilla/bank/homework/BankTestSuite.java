package com.kodilla.bank.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank;
    int noOfDeposits;
    int noOfWithdrawals;
    double balance;
    double withdrawalAverage;
    double depositAverage;

    @DisplayName("State under test: no cash machines " +
                 "Expected Behaviour: balance is 0, number of deposits and withdrawals is 0")
    @Test
    public void shouldHaveZeroBalanceIfNoCashMachines() {
        bank = new Bank(0);
        balance = bank.getBalance();
        noOfDeposits = bank.getNumberOfDeposits();
        noOfWithdrawals = bank.getNumberOfWithdrawals();
        assertEquals(0,balance,0.01);
        assertEquals(0,noOfDeposits);
        assertEquals(0,noOfWithdrawals);
    }

    @DisplayName("State under test: cash machines exist, no transactions made " +
                 "Expected Behaviour: balance is 0, number of deposits and withdrawals is 0")
    @Test
    public void shouldHaveZeroBalanceIfNoTransactions() {
        bank = new Bank(5);
        balance = bank.getBalance();
        noOfDeposits = bank.getNumberOfDeposits();
        noOfWithdrawals = bank.getNumberOfWithdrawals();
        assertEquals(0,balance,0.01);
        assertEquals(0,noOfDeposits);
        assertEquals(0,noOfWithdrawals);
    }

    @DisplayName("State under test: cash machine number out of range when making transaction " +
                 "Expected Behaviour: no transactions made: balance is 0, number of deposits and withdrawals is 0")
    @Test
    public void shouldHaveZeroBalanceIfMachineNoOutOfRange(){
        bank = new Bank(5);
        bank.makeTransaction(-1, 20);
        balance = bank.getBalance();
        noOfDeposits = bank.getNumberOfDeposits();
        noOfWithdrawals = bank.getNumberOfWithdrawals();
        assertEquals(0,balance,0.01);
        assertEquals(0,noOfDeposits);
        assertEquals(0,noOfWithdrawals);

        bank.makeTransaction(6, 20);
        balance = bank.getBalance();
        noOfDeposits = bank.getNumberOfDeposits();
        noOfWithdrawals = bank.getNumberOfWithdrawals();
        assertEquals(0,balance,0.01);
        assertEquals(0,noOfDeposits);
        assertEquals(0,noOfWithdrawals);
    }

    @DisplayName("State under test: cash machine numbers in range when making transactions " +
                 "Expected Behaviour: all transactions made: balance is sum of transactions, " +
                 "number of deposits and withdrawals made are counted correctly")
    @Test
    public void shouldHaveCorrectBalanceAfterValidTransactionsAtAllCashMachines() {
        bank = new Bank(3);
        bank.makeTransaction(0,20);
        bank.makeTransaction(1,30);
        bank.makeTransaction(0,60);
        bank.makeTransaction(2,100);
        bank.makeTransaction(1,-20);
        bank.makeTransaction(0,-10);
        balance = bank.getBalance();
        noOfDeposits = bank.getNumberOfDeposits();
        noOfWithdrawals = bank.getNumberOfWithdrawals();
        assertEquals(180,balance,0.01);
        assertEquals(4,noOfDeposits);
        assertEquals(2,noOfWithdrawals);
    }

    @DisplayName("State under test: one cash machine used, machine number in range when making transactions " +
                 "Expected Behaviour: all transactions made: balance is sum of transactions, " +
                 "number of deposits and withdrawals made are counted correctly")
    @Test
    public void shouldHaveCorrectBalanceAfterValidTransactionsAtOneCashMachine() {
        bank = new Bank(3);
        bank.makeTransaction(0,20);
        bank.makeTransaction(0,60);
        bank.makeTransaction(0,-10);
        balance = bank.getBalance();
        noOfDeposits = bank.getNumberOfDeposits();
        noOfWithdrawals = bank.getNumberOfWithdrawals();
        assertEquals(70,balance,0.01);
        assertEquals(2,noOfDeposits);
        assertEquals(1,noOfWithdrawals);
    }

    @DisplayName("State under test: no cash machines " +
                 "Expected Behaviour: withdrawal average is 0")
    @Test
    public void shouldReturnWithdrawalAverageEqualsZeroIfNoCashMachines() {
        bank = new Bank(0);
        withdrawalAverage = bank.getWithdrawalAverage();
        assertEquals(0,withdrawalAverage, 0.01);
    }

    @DisplayName("State under test: cash machines exist, no transactions made " +
                 "Expected Behaviour: withdrawal average is 0")
    @Test
    public void shouldReturnWithdrawalAverageEqualsZeroIfNoTransactions() {
        bank = new Bank(3);
        withdrawalAverage = bank.getWithdrawalAverage();
        assertEquals(0,withdrawalAverage, 0.01);
    }

    @DisplayName("State under test: deposit made, no withdrawals " +
                 "Expected Behaviour: withdrawal average is 0")
    @Test
    public void shouldReturnWithdrawalAverageEqualsZeroIfNoWithdrawals() {
        bank = new Bank(10);
        bank.makeTransaction(3,300);
        withdrawalAverage = bank.getWithdrawalAverage();
        assertEquals(0,withdrawalAverage, 0.01);
    }

    @DisplayName("State under test: correct deposits and withdrawals made " +
                 "Expected Behaviour: withdrawal average is calculated correctly")
    @Test
    public void shouldCalculateCorrectWithdrawalAverage() {
        bank = new Bank(10);
        bank.makeTransaction(3,300);
        bank.makeTransaction(0, 30);
        bank.makeTransaction(0,-20);
        bank.makeTransaction(4,55);
        bank.makeTransaction(3,-15);
        bank.makeTransaction(4,-14);
        withdrawalAverage = bank.getWithdrawalAverage();
        assertEquals(-16.33,withdrawalAverage, 0.01);
    }

    @DisplayName("State under test: no cash machines " +
                 "Expected Behaviour: deposit average is 0")
    @Test
    public void shouldReturnDepositAverageEqualsZeroIfNoCashMachines() {
        bank = new Bank(0);
        depositAverage = bank.getDepositAverage();
        assertEquals(0,depositAverage, 0.01);
    }

    @DisplayName("State under test: cash machines exist, no transactions made " +
                 "Expected Behaviour: deposit average is 0")
    @Test
    public void shouldReturnDepositAverageEqualsZeroIfNoTransactions() {
        bank = new Bank(5);
        depositAverage = bank.getDepositAverage();
        assertEquals(0,depositAverage, 0.01);
   }

    @DisplayName("State under test: withdrawal attempted, no deposits " +
                 "Expected Behaviour: deposit average is 0")
    @Test
    public void shouldReturnDepositAverageEqualsZeroIfNoDeposits() {
        bank = new Bank(2);
        bank.makeTransaction(3,-30);
        depositAverage = bank.getDepositAverage();
        assertEquals(0,depositAverage, 0.01);
    }

    @DisplayName("State under test: correct deposits and withdrawals made " +
                 "Expected Behaviour: deposit average is calculated correctly")
    @Test
    public void shouldCalculateCorrectDepositAverage() {
        bank = new Bank(10);
        bank.makeTransaction(3,300);
        bank.makeTransaction(0, 30);
        bank.makeTransaction(0,-20);
        bank.makeTransaction(4,55);
        bank.makeTransaction(3,-15);
        bank.makeTransaction(4,-14);
        depositAverage = bank.getDepositAverage();
        assertEquals(128.33,depositAverage, 0.01);
    }
}
