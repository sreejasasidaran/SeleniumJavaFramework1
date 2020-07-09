package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

public class Demo_TestNG2 {
	static WebDriver driver = null;

	@BeforeClass
	public static void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearch2() {

		//open the URL google.com
		driver.get("https://google.com");

		//enter text  in search box
		driver.findElement(By.name("q")).sendKeys("automation steps");

		//click on search button
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);

	}

	@Test
	public static void googleSearch3() {

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
		driver.quit();
		System.out.println("test completed");
	}

}

