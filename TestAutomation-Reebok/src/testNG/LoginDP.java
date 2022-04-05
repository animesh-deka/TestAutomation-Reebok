package testNG;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginDP {
	WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\UPES\\Year 3\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop4reebok.com/");
	}
  
	@Test(dataProviderClass = DataTest.class, dataProvider = "loginTest")
	public void loginDP(String username, String pwd, String browser, String version) {
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		login.click();
		WebElement userName = driver.findElement(By.id("usrName"));
		userName.sendKeys("animesh14941@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("V$iHZb3BbJFXAEY");
		WebElement signButt = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[1]/form[1]/div[5]/button"));
		signButt.click();
	}

	@AfterMethod
	public void afterTest() {
		driver.quit();
	}

}
