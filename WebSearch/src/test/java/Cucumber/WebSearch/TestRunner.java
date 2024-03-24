package Cucumber.WebSearch;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/search.feature",
                 glue = {"Cucumber.WebSearch"})
public class TestRunner{
	
}
