package co.gurung;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/co/gurung"
        ,glue={"myRunners"}
)
public class RunTest {
}
