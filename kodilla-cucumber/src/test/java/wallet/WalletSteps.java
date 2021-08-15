package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private String answer;

    public WalletSteps() {
        Given("I have deposited ${int} in my wallet", (Integer money) -> {
            wallet.deposit(money);
            Assert.assertEquals("Incorrect wallet balance", (int) money, wallet.getBalance());
        });

        Given("I have not deposited anything in my wallet", () -> {
            Assert.assertEquals(0, wallet.getBalance());
        });

        When("I request ${int}", (Integer amount) -> {
            Cashier cashier = new Cashier(cashSlot);
            answer = cashier.withdraw(wallet, amount);
        });

        Then("${int} should be dispensed", (Integer amount) -> {
            Assert.assertEquals((int) amount, cashSlot.getContents());
        });

        Then("the balance of my wallet should be {int}", (Integer balance) -> {
            Assert.assertEquals("Incorrect wallet balance", (int) balance,  wallet.getBalance());
        });

        Then("Answer should be {string}", (String string) -> {
            Assert.assertEquals("Incorrect answer", string, this.answer);
        });
    }
}