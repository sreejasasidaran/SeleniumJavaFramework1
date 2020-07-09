package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {
	WebDriver driver=null;
	@BeforeClass
	public  void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "test1Data")
	public void test1(String UserName, String Password) throws InterruptedException {
		System.out.println(UserName+" | "+Password);
		driver.get("https://login.globalglaze.in/");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_usernm")).sendKeys(UserName);
		driver.findElement(By.id("adminpasswor")).sendKeys(Password);
		Thread.sleep(3000);
	}

	@DataProvider(name="test1Data")
	public Object[][] getData() {
		String excelPath = "C:\\Users\\SREEJA\\workspace\\SeleniumJavaProject\\Excel\\Data.xlsx";
		Object data[][]=testData(excelPath, "Sheet1");
		return data;
	}
	public  Object[][] testData(String excelPath, String sheetName) {


		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = ExcelUtils.getRowCount();
		int colCount = ExcelUtils.getColCount();

		Object data[][]= new Object[rowCount-1][colCount]; 
		for (int i=1;i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				String cellData= ExcelUtils.getCellDataString(i,j);
				//System.out.print(cellData+" ");
				data[i-1][j] = cellData;
			}

			//System.out.println();
		}
		return data;
	}
}