import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //features = "src/test/java/features/login.feature",   // manually type for feature file location
        //features = "src/test/java/features/dataTable.feature",
        features = "src/test/java/features/scenarioOutline.feature",
        glue = "stepDef",                       // manually type make relation between features file with stepDef by glue
        //tags = "@login",
        //tags = "@dataTable",                  // This is tags, newly added
        tags = "@scenarioOutline",
        plugin = {                              // manually type for report
                "json:target/cucumber.json"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // extends AbstractTestNGCucumberTests for Automate
}
