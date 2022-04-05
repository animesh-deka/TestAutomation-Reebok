package logs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class articleDetailSS {

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
		
		WebElement article = driver.findElement(By.xpath("/html/body/div[7]/div[1]/div/div[2]/ul/li[1]/div/a/img"));
		article.click();
		ArrayList<String> chromeTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(chromeTabs.get(1));
		BaseTest.captureScreenshort(driver);
		
	    System.out.println("Product: "+driver.findElement(By.xpath("/html/body/div[13]/div[3]/div[1]/div/div[1]/div[3]/h1")).getText());
	    System.out.println("Price: "+driver.findElement(By.xpath("/html/body/div[13]/div[3]/div[1]/div/div[1]/div[3]/div[2]/span[2]/span")).getText());
	    System.out.println("Add To Cart is enabled: "+driver.findElement(By.id("addToBagBtn")).isEnabled());
	    System.out.println("Select Size is enabled: "+driver.findElement(By.id("size")).isEnabled());
	    System.out.println("Add To Wishlist is enabled: "+driver.findElement(By.id("saveToWishlist")).isEnabled());
	    System.out.println("Product Description is enabled: "+driver.findElement(By.id("step-Desc")).isEnabled());
	    System.out.println("Product Specification is enabled: "+driver.findElement(By.id("step-Spec")).isEnabled());
	    System.out.println("Back To Top is enabled: "+driver.findElement(By.id("scrollToTop")).isEnabled());
		BaseTest.captureScreenshort(driver);
		BaseTest.tearDown(driver);
	}
}
