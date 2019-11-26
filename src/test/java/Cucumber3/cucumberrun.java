package Cucumber3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
		plugin= {"json:src/test/java/Cucumber3.json"})
public class cucumberrun {
	

}
