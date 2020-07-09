package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import config.PropertiesFile;
import net.bytebuddy.asm.Advice.Return;

public class Demo_TestNG {
	static WebDriver driver = null;
	//public static String browserName=null;
	public static  String browserName=null;


	@BeforeClass
	public static void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SREEJA\\workspace\\SeleniumJavaProject\\Drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	@Test
	public static void googleSearch() {

		//open the URL google.com
		driver.get("https://google.com");

		//enter text  in search box
		driver.findElement(By.name("q")).sendKeys("automation steps");

		//click on search button
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);

	}

	@AfterClass
	public static void tearDownTest() {
		//close browser
		driver.close();
		//driver.quit();
		System.out.println("test completed");
		PropertiesFile.setProperties();
	}

}

