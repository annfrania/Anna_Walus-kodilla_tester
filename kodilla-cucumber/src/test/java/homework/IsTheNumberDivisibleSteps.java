package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsTheNumberDivisibleSteps implements En {
    private Integer value;
    private String answer;

    public IsTheNumberDivisibleSteps() {
        Given("Number is 9", () -> {
            this.value = 9;
        });
        Given("Number is 20", () -> {
            this.value = 20;
        });
        Given("Number is 30", () -> {
            this.value = 30;
        });
        Given("Number is 7", () -> {
            this.value = 7;
        });
        Given("Number is 8", () -> {
            this.value = 8;
        });
        Given("Number is 13", () -> {
            this.value = 13;
        });
        Given("Number is 185", () -> {
            this.value = 185;
        });
        Given("Number is 270", () -> {
            this.value = 270;
        });
        Given("Number is 18", () -> {
            this.value = 18;
        });
        Given("Number is 300", () -> {
            this.value = 300;
        });

        When("I ask if it's divisible by 3,5,both or none", () -> {
            DivChecker divChecker = new DivChecker();
            this.answer = divChecker.checkIfDivisible(this.value);
        });

        Then("I should be answered {string}", (String string) -> {
            Assert.assertEquals(string,this.answer);
        });


    }
}
