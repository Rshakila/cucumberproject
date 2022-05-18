package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition2 {

WebDriver driver;
@Given("User launch Amazon Web Application")
public void user_launch_Amazon_Web_Application() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions op=new ChromeOptions();
	op.addArguments("---disabled-notification");
	op.addArguments("--start-maximized");
    driver=new ChromeDriver(op);
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	

}

@When("user enter valid {string}")
public void user_enter_valid(String string) {
	driver.findElement(By.id("ap_email")).sendKeys("87463461133");
    
}

@When("User click continue button")
public void user_click_continue_button() {
	driver.findElement(By.id("continue")).click();
    
}

@When("user enter invalid {string}")
public void user_enter_invalid(String string) {
	driver.findElement(By.id("ap_email")).sendKeys("axbxhbb@gmail.com");
   
}

@When("user enter Empty {string}")
public void user_enter_Empty(String string) {
	driver.findElement(By.id("ap_email")).sendKeys("visalam55@gmail.com");
}



}
