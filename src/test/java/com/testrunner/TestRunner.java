package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="./src/test/resources/Features",
		glue="com.amazonStepDef"
		
		
		
		
		)





public class TestRunner extends AbstractTestNGCucumberTests {

}
