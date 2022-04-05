package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Registration {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\UPES\\Year 3\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop4reebok.com/");
	}
  
	@Test
	public void registrationTest() {
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		login.click();
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[1]/div/input"));
		fname.sendKeys("First");
		WebElement lname = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[2]/div/input"));
		lname.sendKeys("Last");
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[3]/div/input"));
		email.sendKeys("random@random.com");
		WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[4]/div/input"));
		pass.sendKeys("Random@123");
		WebElement repass = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[5]/div/input"));
		repass.sendKeys("Random@123");
		WebElement gender = driver.findElement(By.id("gender3"));
		gender.click();
		WebElement signupbutt = driver.findElement(By.id("registerButton"));
		signupbutt.click();	
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
