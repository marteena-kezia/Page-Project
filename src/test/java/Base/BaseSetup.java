package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseSetup {
	static WebDriver driver;
	static String driverPath = "C:/Users/Marteena.Kezia/Downloads/chromedriver_win32/"; //local location of driver
	static String baseUrl ="https://www.stealmylogin.com/demo.html"; 
	static String wdriver = "chrome"; //set the browser using
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setDriver(String browserType, String URL)
	{
		switch(browserType)
		{
		case "chrome":
			driver = initChromeDriver("https://www.stealmylogin.com/demo.html");
			break;
		case "firefox":
			driver = initFireIE("https://www.stealmylogin.com/demo.html");
			break;
		default:
			System.out.println("browser:"+browserType+"is invalid,");
		}
	}
	
	public static WebDriver initChromeDriver(String URL)
	{
	System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(baseUrl);
	return driver;
	}
	
	public static WebDriver initFireIE(String URL)
	{
	System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
	driver = new InternetExplorerDriver();
	driver.navigate().to(baseUrl);
	return driver;
	}

	@BeforeSuite
	public void initializeTestBaseSetup() {
		try {
			setDriver(wdriver, baseUrl);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
