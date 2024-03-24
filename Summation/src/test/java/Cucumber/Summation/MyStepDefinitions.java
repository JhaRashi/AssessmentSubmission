package Cucumber.Summation;
import java.util.List;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MyStepDefinitions {

    private List<Integer> data;
    @Given("My data is ready")
    public void myDataIsReady() {
        // You can initialize any required setup here
    }
    @When("My data is {int}, {int}, {int}")
    public void myDataIs(Integer r1, Integer r2, Integer r3) {
        data = List.of(r1, r2, r3);
    }
    @Then("The summation of {int}, {int}, and {int} is {string}")
    public void theSummationOfIs(Integer r1, Integer r2, Integer r3, String valid) {
        int sum = data.stream().mapToInt(Integer::intValue).sum();
        String actualValidity = (sum % 2 == 0) ? "valid" : "invalid";
        assert actualValidity.equals(valid);
    }
}