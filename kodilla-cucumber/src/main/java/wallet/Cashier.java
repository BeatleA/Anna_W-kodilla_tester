package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if (amount <= 0) {
            return "Incorrect amount";
        } else if (amount > wallet.getBalance()) {
            return "Insufficient balance";
        } else {
            cashSlot.dispense(amount);
            return "Successful withdrawal";
        }
    }
}