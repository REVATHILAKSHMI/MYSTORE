package com.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features/Dresses.feature",
		glue="com.EmailTestcase",
		plugin={"html:TestResult","json:JsonResult/Result.json"},
		monochrome=true,
		tags={"@sc1"}
		
		
		)

public class Runnerclass2 {

}
