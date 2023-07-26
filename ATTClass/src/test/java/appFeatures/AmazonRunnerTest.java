package appFeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\appFeatures" },

		glue = { "appFeatures" },

		publish = true,

		plugin = { "pretty" }
		
//		tags ="@sanity"       // why not taking sanity only

)
public class AmazonRunnerTest extends AbstractTestNGCucumberTests {

}
