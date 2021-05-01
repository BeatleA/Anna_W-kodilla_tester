package com.kodilla.bank.homework;

import org.junit.jupiter.api.DisplayName;
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

    @DisplayName("State under test: no transactions made " +
                 "Expected Behaviour: balance is 0, number of transactions, deposits and withdrawals is 0")
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

    @DisplayName("State under test: no deposits made, withdrawal attempted " +
                 "Expected Behaviour: no transactions made: balance is 0, " +
                 "number of transactions, deposits and withdrawals is 0")
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

    @DisplayName("State under test: one deposit made " +
                 "Expected Behaviour: deposit made: balance is the value of the deposit, " +
                 "number of transactions and deposits is 1, number of withdrawals is 0")
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

    @DisplayName("State under test: one deposit made, withdrawal higher than deposit attempted " +
                 "Expected Behaviour: deposit made, withdrawal not made: balance is the value of the deposit, " +
                 "number of transactions and deposits is 1, number of withdrawals is 0")
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

    @DisplayName("State under test: one deposit made, withdrawal lower than deposit made " +
                 "Expected Behaviour: deposit made, withdrawal made: balance is the value of deposit - withdrawal, " +
                 "number of transactions is 2, number of deposits is 1, number of withdrawals is 1")
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

    @DisplayName("State under test: one deposit made, withdrawal equal to deposit made " +
            "Expected Behaviour: deposit made, withdrawal made: balance is 0, " +
            "number of transactions is 2, number of deposits is 1, number of withdrawals is 1")
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

    @DisplayName("State under test: correct deposits and withdrawals made " +
                 "Expected Behaviour: all transactions made: balance is sum of transactions, " +
                 "number of transactions, deposits and withdrawals made are counted correctly")
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

    @DisplayName("State under test: no transactions made " +
                 "Expected Behaviour: withdrawal average is 0")
    @Test
    public void shouldReturnWithdrawalAverageEqualsZeroIfNoTransactions() {
        cashMachine = new CashMachine();
        withdrawalAverage = cashMachine.getWithdrawalAverage();
        assertEquals(0,withdrawalAverage, 0.01);
    }

    @DisplayName("State under test: deposit made, no withdrawals " +
                 "Expected Behaviour: withdrawal average is 0")
    @Test
    public void shouldReturnWithdrawalAverageEqualsZeroIfNoWithdrawals() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(300);
        withdrawalAverage = cashMachine.getWithdrawalAverage();
        assertEquals(0,withdrawalAverage, 0.01);
    }

    @DisplayName("State under test: correct deposits and withdrawals made " +
                 "Expected Behaviour: withdrawal average is calculated correctly")
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

    @DisplayName("State under test: no transactions made " +
                 "Expected Behaviour: deposit average is 0")
    @Test
    public void shouldReturnDepositAverageEqualsZeroIfNoTransactions() {
        cashMachine = new CashMachine();
        depositAverage = cashMachine.getDepositAverage();
        assertEquals(0,depositAverage, 0.01);
    }

    @DisplayName("State under test: no deposits made, withdrawal attempted " +
                 "Expected Behaviour: deposit average is 0")
    @Test
    public void shouldReturnDepositAverageEqualsZeroIfNoDeposits() {
        cashMachine = new CashMachine();
        cashMachine.makeTransaction(-300);
        depositAverage = cashMachine.getDepositAverage();
        assertEquals(0,depositAverage, 0.01);
    }

    @DisplayName("State under test: correct deposits and withdrawals made " +
                 "Expected Behaviour: deposit average is calculated correctly")
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
