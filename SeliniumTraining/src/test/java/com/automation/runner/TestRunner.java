package com.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features\\HRM.feature", tags= "@MultipleData" ,glue="com.automaton.stepdefinitions",plugin = {"html:cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
	//name="Login with Multiple data" 
	
	//[TestNG] No tests found. Nothing was run
}
  