package com.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(features = "Feature",
					glue = {"StepDefinition"})


public class CucumberRunner {
}