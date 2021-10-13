package Runner; 

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/FeatureofReports"}
		, glue = {"StepDefinition"},
		plugin = {"json:target/reports/report.json","junit:target/reports/report.xml"}
		,publish=true
				
		)
public class RunTest {

}
