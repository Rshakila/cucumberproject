package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;

@Given("User Launch Adactin Web Application")
public void user_Launch_Adactin_Web_Application() {
	WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://adactinhotelapp.com/");
    
	
    }

@When ("User enter valid {string} and {string}")
public void user_enter_valid_and(String string, String string2) {
	driver.findElement(By.id("username")).sendKeys("shakila555");
	driver.findElement(By.id("password")).sendKeys("ramapriya");
   }

@When("User click login button")
public void user_click_login_button() throws InterruptedException {
	Thread.sleep(3000);
    driver.findElement(By.id("login")).click();
}

@Then("user verify Home page Displayed")
public void user_verify_Home_page_Displayed() {
	String t1 = driver.findElement(By.xpath("//td[@class='login_title']")).getText();
	boolean a = t1.contains(t1);
	System.out.println(a);
	
}
@When("User Select {string},{string},{string},{string},{string}")
public void user_Select(String string, String string2, String string3, String string4, String string5) {
	 driver.findElement(By.id("location")).sendKeys("Adelaide");


	 driver.findElement(By.id("hotels")).sendKeys("Hotel Hervey");
	 driver.findElement(By.id("room_type")).sendKeys("Deluxe");
	 driver.findElement(By.id("room_nos")).sendKeys("3 - Three");

	 driver.findElement(By.id("datepick_in")).sendKeys("25.4.2023");
	 
}

@When("User select {string},{string},{string}")
public void user_select(String string, String string2, String string3) {
	 driver.findElement(By.id("datepick_out")).sendKeys("22.5.2023");
	 driver.findElement(By.id("adult_room")).sendKeys("2 - Two");
	 driver.findElement(By.id("child_room")).sendKeys("4 - Four");
}

@When("User click search button")
public void user_click_search_button() {
	driver.findElement(By.name("Submit")).click();
  
}

@Then("verify and select Home page Displayed")
public void verify_and_select_Home_page_Displayed() {
    String t2 = driver.findElement(By.xpath("//td[text()='Select Hotel ']")).getText();
   System.out.println(t2);
    boolean b = t2.contains(t2);
    System.out.println(b);
    
}

@When("User click  Radiobutton and click continue")
public void user_click_Radiobutton_and_click_continue() {
    driver.findElement(By.id("radiobutton_0")).click();
    driver.findElement(By.name("continue")).click();
	
}

@Then("User verify hotel page is displayed")
public void user_verify_hotel_page_is_displayed() {
	String t3 = driver.findElement(By.xpath("//td[text()='Book A Hotel ']")).getText();
	System.out.println(t3);
	boolean c = t3.contains(t3);
	System.out.println(c);
	
   }

@When("User enter {string},{string},{string}")
public void user_enter(String string, String string2, String string3) {
	driver.findElement(By.name("first_name")).sendKeys("shakila");
	driver.findElement(By.name("last_name")).sendKeys("Rajendran");
	driver.findElement(By.name("address")).sendKeys("1/189,pakkiriya pillai st,mayiladuthurai");
	
	
   
}

@When("User enter Valid {string},{string},{string},{string},{string}")
public void user_enter_Valid(String string, String string2, String string3, String string4, String string5) {
    driver.findElement(By.name("cc_num")).sendKeys("2345678901223235");
	driver.findElement(By.name("cc_type")).sendKeys("VISA");
 driver.findElement(By.name("cc_exp_month")).sendKeys("may");
 
 driver.findElement(By.name("cc_exp_year")).sendKeys("2015");
 driver.findElement(By.name("cc_cvv")).sendKeys("0908");
 
}

@When("click Book Now button")
public void click_Book_Now_button() {
	driver.findElement(By.id("book_now")).click();
    
}
@Then("user Verify Order Id")
public void user_Verify_Order_Id() {
   
	String t4 = driver.findElement(By.name("order_no")).getText();
	System.out.println(t4);
   boolean c = t4.contains(t4);
   System.out.println(c);
}

}
