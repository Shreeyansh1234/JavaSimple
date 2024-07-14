package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement UserNameTextField;
	WebElement PasswordTextField;
	WebElement SubmitBTN;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;		
	}
	
	public WebElement getUserNameTextField() {
		setUserNameTextField();
		return UserNameTextField;
	}
	private void setUserNameTextField() {
		UserNameTextField  = driver.findElement(By.xpath("//input[@name='userName']"));
	}

	public WebElement getPasswordTextField() {
		setPasswordTextField();
		return PasswordTextField;
	}

	private void setPasswordTextField() {
		PasswordTextField = driver.findElement(By.xpath("//input[@name='password']"));
	}

	public WebElement getSubmitBTN() {
		setSubmitBTN();
		return SubmitBTN;
	}

	private void setSubmitBTN() {
		SubmitBTN = driver.findElement(By.xpath("//input[@name='submit']"));
	}
	
	public void SubmitBtnClick() {
		getSubmitBTN().click();
	}

}
