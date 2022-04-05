package logs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSS{
	public static void main(String[] args){
		BaseTest.setUpBrowser();		
		WebDriver driver = BaseTest.generateTest();		
		
		driver.findElement(By.linkText("LOGIN")).click();
		BaseTest.captureScreenshort(driver);		
		driver.findElement(By.id("usrName")).sendKeys("animesh14941@gmail.com");
		BaseTest.captureScreenshort(driver);		
		driver.findElement(By.id("password")).sendKeys("V$iHZb3BbJFXAEY");	
		BaseTest.captureScreenshort(driver);
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[1]/form[1]/div[5]/button")).click();
		BaseTest.captureScreenshort(driver);					
		BaseTest.tearDown(driver);
	}
}
