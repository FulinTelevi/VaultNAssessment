package com.trello.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/features",
		glue = "com.trello.steps", 
		dryRun = false, 
		tags = "@smoke8",

		monochrome = true,

		plugin = { 
				"pretty", 
				"html:target/cucumber-default-report.html", 
				"json:target/cucumber.json" 
				}

)
public class TestRunner {

}
