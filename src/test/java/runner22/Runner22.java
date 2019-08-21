package runner22;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"json:target/cucumber23.json"}, features= "Feature22", glue ="stepdef22")
public class Runner22 {
}
