import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\UPES\\Year 3\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop4reebok.com/");
		
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		login.click();
		WebElement userName = driver.findElement(By.id("usrName"));
		userName.sendKeys("animesh14941@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("V$iHZb3BbJFXAEY");
		WebElement signButt = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[1]/form[1]/div[5]/button"));
		signButt.click();
	}
}
