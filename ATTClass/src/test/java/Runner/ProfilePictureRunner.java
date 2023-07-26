package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "src\\test\\resources\\application\\Test\\ProfilePicture.feature" }, 
		glue = { "steps", "hooks" }, 
		plugin = { "pretty" }

)

public class ProfilePictureRunner extends AbstractTestNGCucumberTests{

}
