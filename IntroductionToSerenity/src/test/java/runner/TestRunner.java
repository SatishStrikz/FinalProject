package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\java\\features\\HomePage.feature",
glue={"stepDefinitions"},tags="@OrangeHRM")

public class TestRunner  {

}

