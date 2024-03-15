package hookspractice2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Featurefilehooks",
glue="hookspractice2",
dryRun = false,
monochrome = true)
public class Testrunner {

}
