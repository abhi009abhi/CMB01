package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features= {"F:\\Testing\\PHOTON2\\CMB01\\CMB01\\Features"},
glue= {"stepDefinitions"},
monochrome =true,
dryRun=false,
plugin= 
{
	"pretty", 
	"json:target/cucumber-reports/cucumber.json",
	/*"junit:target/cucumber-reports/Cucumber.xml",
	"html:target/cucumber-reports"*/
}
)
public class Runner {

}
