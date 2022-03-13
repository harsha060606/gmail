package cucumberRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"gluecode"},
monochrome=true,
plugin= {"pretty","html:target/Htmlreport",
		"json:target/JSONREPORTS/Jsonreport.json",
        "junit:target/xmlreport.xml"}
		)
public class runner {

}
