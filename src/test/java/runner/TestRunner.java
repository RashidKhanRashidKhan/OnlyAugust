package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", plugin= {"pretty", "json:target/TestReport/Cucumber.json",
		"html:target/TestReport/Report.html"},
glue= {"stepsDefinition", "bases"}, tags="@Reg")






public class TestRunner {

}
