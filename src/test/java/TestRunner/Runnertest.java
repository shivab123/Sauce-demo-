package TestRunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= "src/test/java/Features",
		glue="StepDefination",
		dryRun= false
		
		)
public class Runnertest {

}
