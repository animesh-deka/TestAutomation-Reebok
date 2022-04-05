import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\UPES\\Year 3\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop4reebok.com/");
		
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
}

