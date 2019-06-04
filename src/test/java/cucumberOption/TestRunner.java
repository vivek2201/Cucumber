package cucumberOption;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions (
features= "src/test/java/features/RSG.feature",
glue="StepDefination"
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
