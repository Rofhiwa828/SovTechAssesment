import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Runner class with extent reports configurations. Class is compatible with JUnit.

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature Files/SovTechFeatures/ContactUsFeature.feature",
        glue = {"stepDefinition/sovTechContactUsStepDefs"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty:STDOUT","html:Reports/cucumberhtmlreport",
        "com.cucumber.listener.ExtentCucumberFormatter:Output/Report.html"},tags = "@run"

)
public class Runner {


}
