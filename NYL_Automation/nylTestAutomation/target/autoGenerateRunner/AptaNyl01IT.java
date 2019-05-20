import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/NYL_Automation/nylTestAutomation/src/main/resources/Feature/apta_NYL.feature"},
        plugin = {"json:D:/NYL_Automation/nylTestAutomation/target/cucumber-parallel/json/1.json", "rerun:D:/NYL_Automation/nylTestAutomation/target/cucumber-parallel/1.txt"},
        monochrome = true,
        tags = {"@AptaRegression_4"},
        glue = {"StepDef"})
public class AptaNyl01IT {
}
