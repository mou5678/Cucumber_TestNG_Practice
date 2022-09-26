package com.myrunnerpackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "./Features",
		glue ="com.mystepdefpackage",
		tags = "@Smoke"
		
		)

public class MyRunnerClassMou extends AbstractTestNGCucumberTests{

}
