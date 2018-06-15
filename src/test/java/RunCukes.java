
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},monochrome=true, plugin = {"pretty", "html:target/cucumber"}) //glue= {"steps"}, monochrome=true)
public class RunCukes {

}
