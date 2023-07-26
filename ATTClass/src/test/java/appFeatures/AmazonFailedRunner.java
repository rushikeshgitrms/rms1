package appFeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources\\appFeatures" },

		glue = { "appFeatures" },

		publish = true,

		plugin = { "pretty", "rerun:target/failedrun.txt" }
		

)
public class AmazonFailedRunner extends AbstractTestNGCucumberTests {

}
