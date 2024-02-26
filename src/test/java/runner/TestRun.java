package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
					features= {".//FeatureFiles/ToAndFrom_Details.feature"}, 
					glue="stepDefinitions"
			    )
public class TestRun {

}
