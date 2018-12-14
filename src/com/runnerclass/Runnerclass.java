package com.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features="Features",
		glue={"com.Tesecases"},
		plugin={"html:TestResult","json:JsonResult/Result.json"},
		monochrome=true
		
)
public class Runnerclass{

}
