package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class searchArticle {
	WebDriver driver;
		
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\UPES\\Year 3\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop4reebok.com/");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void searchTest() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement searchbar = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div[1]/div/div/div/input"));
		searchbar.click();
		searchbar.sendKeys("MEN'S REEBOK RUNNING LIQUIFECT 90 SHOES");
		WebElement searchbutt = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div[1]/div/div/div/span[1]/img"));
		searchbutt.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement link = driver.findElement(By.linkText("MEN'S REEBOK RUNNING LIQUIFECT 90 SHOES"));
		boolean res = link.getText().contains("RUNNING LIQUIFECT 90 SHOES");
		System.out.println("Link is present: "+res);
		
		WebElement image = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[2]/ul/li[1]/div/a/img"));
		res=image.isEnabled();
		System.out.println("Image is present: "+res);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
