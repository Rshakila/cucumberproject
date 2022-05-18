package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.CuReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Amazon.feature",glue="com.stepdefinition",plugin= {"pretty","json:C:\\Users\\User\\eclipse-workspace\\cucumberMay\\src\\test\\resources\\Report\\rep.json"})
public class TestRunner2 {
@AfterClass
public static void report() {
	CuReport.generateReport("C:\\Users\\User\\eclipse-workspace\\cucumberMay\\src\\test\\resources\\Report\\rep.json");


}

}
