import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/features/user.feature",
        glue = "src/test/java/com/typicode/user/steps",
        tags = "not @skip",
        plugin = {"pretty", "json:target/cucumber-report.json"},
        publish = true
)

public class TestRunner {
}