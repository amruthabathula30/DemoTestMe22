package runner22;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature22",glue="stepdef22",plugin= {"json:target/cucumber.json"})

public class Runner22 {

}
