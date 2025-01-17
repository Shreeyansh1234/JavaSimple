package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.utility;

public class StepDefination {
	WebDriver driver;
	
	@Given("Launch application")
	public void launchApplication() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/newtours/");
		//driver.get(utility.readProperty("envUrl"));
	}
	
	
	@When("user enters user name text field")
	public void EnterUserName() {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Admin");
	}
	
	@And("user enters password in password text field")
	public void EnterPassword() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
	}
	
	@And("click submit button")
	public void ClickSubmitButton() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	@Then("user enter successfull msg displayed")
	public void SuccessfullyMsgDisplayed() {
		assertEquals(driver.findElement(By.xpath("//h3")).getText(),"Login Successfully");
	}
	

}
