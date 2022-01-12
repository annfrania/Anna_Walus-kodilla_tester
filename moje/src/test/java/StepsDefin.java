import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepsDefin {
    CalcCucumber calc;
    int result;

    @Given("I test calculator")
    public void i_test_calculator() {
        calc = new CalcCucumber();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = calc.sum(int1, int2);
    }

    @Then("result is {int}")
    public void result_is(Integer int1) {
        Assertions.assertEquals(int1, result);
    }
}
