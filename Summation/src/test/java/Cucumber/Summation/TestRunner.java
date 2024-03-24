package Cucumber.Summation;
public class TestRunner {
	public static void main(String[] args) {
        MyStepDefinitions stepDefinitions = new MyStepDefinitions();
        
        // Execute the steps
        stepDefinitions.myDataIsReady();
        stepDefinitions.myDataIs(1, 2, 3);
        stepDefinitions.theSummationOfIs(1, 2, 3, "valid");

        // Print output
        System.out.println("Test executed successfully.");
    }
}
