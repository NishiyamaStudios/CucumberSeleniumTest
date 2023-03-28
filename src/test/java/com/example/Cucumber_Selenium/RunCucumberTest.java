package com.example.Cucumber_Selenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Discovery - Formulation - Automation

// För att autogenerera klasser till vår StepDefinition så kan man köra
// RunCucumberTest när StepDefinition är tom, då får vi felmeddelande
// med förslag på klasser.

// @CucumberOptions(features = "src/test/java/com/example/Cucumber_Selenium/resources", publish = true)
// publish skapar en automatisk rapport!
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/example/Cucumber_Selenium/resources", publish = true)
public class RunCucumberTest {
}
