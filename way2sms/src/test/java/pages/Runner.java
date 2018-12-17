package pages;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"F:\\Bddf\\way2sms\\src\\test\\resources\\files\\feature1.feature"},plugin= {"pretty","html:target/result.html"},monochrome=true)

public class Runner 
{
	
}
