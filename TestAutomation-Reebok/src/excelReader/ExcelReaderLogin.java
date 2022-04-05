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

public class ExcelReaderLogin {

	public static void main(String[] args) throws IOException{
		String username = "";
		String password = "";
		
		try {
			FileInputStream fis = new FileInputStream("C:\\UPES\\Year 3\\Semester 6\\Test Automation\\LabProject\\ReebokExcel.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Login");
			
			int rowCount = sheet.getLastRowNum();
			
			for(int i=1; i<=rowCount; i++ ) {
				XSSFRow row = sheet.getRow(i);
				if(row.getCell(0).getCellType()==CellType.NUMERIC)
					username = row.getCell(0).getRawValue();
				else
					username = row.getCell(0).toString();
				if(row.getCell(1).getCellType()==CellType.NUMERIC)
					password = row.getCell(1).getRawValue();
				else
					password = row.getCell(1).toString();
				login(username, password);
			}
			fis.close();
			wb.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void login(String uname, String pwd) {
		System.out.println("Running TC with username "+uname+" password "+pwd);
		System.setProperty("webdriver.chrome.driver", "C:\\UPES\\Year 3\\Semester 6\\Test Automation\\Lab Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop4reebok.com/");
		
		WebElement login = driver.findElement(By.linkText("LOGIN"));
		login.click();
		WebElement userName = driver.findElement(By.id("usrName"));
		userName.sendKeys(uname);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		WebElement signButt = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div[1]/form[1]/div[5]/button"));
		signButt.click();		
	}
}
