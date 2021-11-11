package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;	
	}
	By username = By.xpath("/html/body/form/input[1]");
	By password = By.xpath("/html/body/form/input[2]");
	By loginbutton = By.xpath("/html/body/form/input[3]");

	
	public void enteruserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	public void enterPassword()
	{
		driver.findElement(password).sendKeys("admin");
	}
	public void clickOnLoginIn() 
	{
		driver.findElement(loginbutton).click();
	}
	
}
