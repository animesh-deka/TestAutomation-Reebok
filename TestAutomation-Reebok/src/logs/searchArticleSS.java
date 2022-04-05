package logs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchArticleSS {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseTest.setUpBrowser();		
		WebDriver driver = BaseTest.generateTest();	
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement searchbar = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div[1]/div/div/div/input"));
		searchbar.click();
		searchbar.sendKeys("MEN'S REEBOK RUNNING LIQUIFECT 90 SHOES");
		BaseTest.captureScreenshort(driver);
		WebElement searchbutt = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div[1]/div/div/div/span[1]/img"));
		searchbutt.click();
		BaseTest.captureScreenshort(driver);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement link = driver.findElement(By.linkText("MEN'S REEBOK RUNNING LIQUIFECT 90 SHOES"));
		System.out.println("Link is present: "+link.getText().contains("RUNNING LIQUIFECT 90 SHOES"));		
		WebElement image = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[2]/ul/li[1]/div/a/img"));
		System.out.println("Image is present: "+image.isEnabled());
		BaseTest.captureScreenshort(driver);
		BaseTest.tearDown(driver);
	}
}
