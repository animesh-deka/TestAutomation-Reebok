package logs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Logger{
	static WebDriver driver;
	static String driverPath;
	static String baseURL;
	
	@Test
	public static void logSample()	{
		driverPath = "C:\\UPES\\Year 3\\\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe";
		baseURL = "https://shop4reebok.com/";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		Reporter.log("Browser is now opened");		
		driver.manage().window().maximize();
		Reporter.log("Browser is now maximized");		
		driver.get(baseURL);
		Reporter.log("Reebok is now opened");		
		driver.close();
		Reporter.log("Browser is now closed");
	}
}
