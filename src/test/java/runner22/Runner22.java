package runner22;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(pluguin= {"json:target/cucumber.json"})

public class Runner22 {

}
