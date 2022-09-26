package com.mystepdefpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class LoginStepDefMou {
	
WebDriver driver;

@Given("^User able to open any browser$")
public void user_able_to_open_any_browser() {
   System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   
}

@Given("^User able to enter the URL \"([^\"]*)\"$")
public void user_able_to_enter_the_URL(String URL) {
   driver.get(URL);
   
}

@When("^User able to click the Sign-in button$")
public void user_able_to_click_the_Sign_in_button() {
	driver.findElement(By.linkText("Sign in")).click();
   
}

@When("^User able to enter userName \"([^\"]*)\"$")
public void user_able_to_enter_userName(String arg1) {
	driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("deym4346@gmail.com");
   
}

@When("^User able to enter the password \"([^\"]*)\"$")
public void user_able_to_enter_the_password(String arg1) {
	driver.findElement(By.id("password")).sendKeys("#Sylhet2014@");
   
}

@When("^User able to click the Log-in button$")
public void user_able_to_click_the_Log_in_button() {
	driver.findElement(By.xpath("(//*[@aria-live ='polite'])[3]")).click();
   
}

@Then("^User able to validate the page title \"([^\"]*)\"$")
public void user_able_to_validate_the_page_title(String expectedResult) throws InterruptedException {
   Thread.sleep(5000);
	Assert.assertEquals(expectedResult, driver.getTitle());
   System.out.println("My expected result is: "+ driver.getTitle());
   
}
}