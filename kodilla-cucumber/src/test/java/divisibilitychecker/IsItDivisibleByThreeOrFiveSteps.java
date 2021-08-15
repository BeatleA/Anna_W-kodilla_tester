package divisibilitychecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItDivisibleByThreeOrFiveSteps implements En{
    private Integer number;
    private String answer;

    public IsItDivisibleByThreeOrFiveSteps() {

        Given("number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I ask whether the number is divisible by 3 or 5", () -> {
            DivisibilityChecker divisibilityChecker = new DivisibilityChecker();
            this.answer = divisibilityChecker.checkIfDivisibleByThreeOrFive(this.number);
        });

        Then("returned text should be {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
