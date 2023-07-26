package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { "src\\test\\resources\\applicationTest\\BackgroundWithScenarioOutline.feature"},
		
		glue = {"SD"},
		
		publish = true,
		
		plugin = {"pretty"}
		
		
		)

public class BackgroundWithScenarioOutlineRunner extends AbstractTestNGCucumberTests {

}
