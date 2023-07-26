package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "src\\test\\resources\\application\\Test\\CaimpaignRunner.feature" }, 
		glue = { "steps"}, 
		plugin = { "pretty" },
//		tags = "@sanity"
		dryRun = true
)
public class CaimpaignRunner extends AbstractTestNGCucumberTests {

}
