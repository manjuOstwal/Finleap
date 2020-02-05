package Fineleap.Automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(features= "src/test/java/Fineleap/Automation/Fineleap.feature",
         glue = {"Fineleap.Automation"},
		 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"},
		 monochrome = true)		
public class Runner {

}



