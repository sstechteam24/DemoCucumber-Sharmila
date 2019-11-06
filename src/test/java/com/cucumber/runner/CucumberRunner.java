package com.cucumber.runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//login.feature
//"com/chase/stepDefination"
@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/biplobroy/Documents/Workspace/DemoCucumber/src/main/java/Feature",
glue = { "StepDefinition" }, format = { "pretty",
		"html:test-output" })


public class CucumberRunner {
}