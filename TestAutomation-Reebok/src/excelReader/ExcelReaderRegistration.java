package excelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReaderRegistration {

	public static void main(String[] args) throws IOException {
		String fname = "";
		String lname = "";
		String email = "";
		String password = "";
		
		try {
			FileInputStream fis = new FileInputStream("C:\\UPES\\Year 3\\Semester 6\\Test Automation\\LabProject\\ReebokExcel.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Registration");
			
			int rowCount = sheet.getLastRowNum();
			
			for(int i=1; i<=rowCount; i++ ) {
				XSSFRow row = sheet.getRow(i);
				if(row.getCell(0).getCellType()==CellType.NUMERIC)
					fname = row.getCell(0).getRawValue();
				else
					fname = row.getCell(0).toString();
				if(row.getCell(1).getCellType()==CellType.NUMERIC)
					lname = row.getCell(1).getRawValue();
				else
					lname = row.getCell(1).toString();
				if(row.getCell(2).getCellType()==CellType.NUMERIC)
					email = row.getCell(2).getRawValue();
				else
					email = row.getCell(2).toString();
				password =  row.getCell(3).getRawValue();
				registration(fname, lname, email, password);
			}
			fis.close();
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void registration(String ufname, String ulname, String uemail, String pwd) {
		System.out.println("Running TC with name "+ufname+" "+ulname+" email "+uemail+ " password "+pwd);
		
		System.setProperty("webdriver.chrome.driver", "C:\\UPES\\Year 3\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop4reebok.com/");
		
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		login.click();
		WebElement fname = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[1]/div/input"));
		fname.sendKeys(ufname);
		WebElement lname = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[2]/div/input"));
		lname.sendKeys(ulname);
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[3]/div/input"));
		email.sendKeys(uemail);
		WebElement pass = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[4]/div/input"));
		pass.sendKeys(pwd);
		WebElement repass = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[2]/form/fieldset/div[5]/div/input"));
		repass.sendKeys(pwd);
		WebElement gender = driver.findElement(By.id("gender3"));
		gender.click();
		WebElement signupbutt = driver.findElement(By.id("registerButton"));
		signupbutt.click();	
	}

}
