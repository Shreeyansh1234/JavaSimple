package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResigstrationPage {
	WebDriver driver;
	WebElement FirstNameTextField;
	WebElement LastnameTextField;
	WebElement CityNameTextField;
	
	public ResigstrationPage(WebDriver driver) {
		this.driver=driver;		
	}
	
	public WebElement getFirstNameTextField() {
		setFirstNameTextField();
		return FirstNameTextField;
	}
	private void setFirstNameTextField() {
		FirstNameTextField  = driver.findElement(By.xpath("//input[@name='firstName']"));
	}

	public WebElement getLastnameTextField() {
		setLastnameTextField();
		return LastnameTextField;
	}

	private void setLastnameTextField() {
		LastnameTextField = driver.findElement(By.xpath("//input[@name='lastName']"));
	}

	public WebElement getCityNameTextField() {
		setCityNameTextField();
		return CityNameTextField;
	}

	private void setCityNameTextField() {
		CityNameTextField = driver.findElement(By.xpath("//input[@name='city']"));
	}
	

}
