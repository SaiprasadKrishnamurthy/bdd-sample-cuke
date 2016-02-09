import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by saipkri on 09/02/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(strict = false, format = {"pretty", "json:target/cucumber.json"}, tags = {"~@ignore"})
public class CucumberTest {

}
