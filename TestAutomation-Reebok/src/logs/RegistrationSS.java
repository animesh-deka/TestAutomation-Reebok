package logs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationSS {

	public static void main(String[] args) {
		BaseTest.setUpBrowser();		
		WebDriver driver = BaseTest.generateTest();	
		
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		login.click();
		BaseTest.captureScreenshort(driver);
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[1]/div/input"));
		fname.sendKeys("First");
		BaseTest.captureScreenshort(driver);
		WebElement lname = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[2]/div/input"));
		lname.sendKeys("Last");
		BaseTest.captureScreenshort(driver);
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[3]/div/input"));
		email.sendKeys("random@random.com");
		BaseTest.captureScreenshort(driver);
		WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[4]/div/input"));
		pass.sendKeys("Random@123");
		BaseTest.captureScreenshort(driver);
		WebElement repass = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[5]/div/input"));
		repass.sendKeys("Random@123");
		BaseTest.captureScreenshort(driver);
		WebElement gender = driver.findElement(By.id("gender3"));
		gender.click();
		BaseTest.captureScreenshort(driver);
		WebElement signupbutt = driver.findElement(By.id("registerButton"));
		signupbutt.click();	
		BaseTest.captureScreenshort(driver);
		BaseTest.tearDown(driver);
	}
}
