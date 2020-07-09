package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null; 
	
	public static void main(String[] args) {
				GoogleSearchTest();
		}
	
	public static void GoogleSearchTest() {
		
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			GoogleSearchPageObjects SeachPageObj=new GoogleSearchPageObjects(driver);
			
			driver.get("https://google.com");
			SeachPageObj.setTextInSearchBox("Automation");
			SeachPageObj.clickSearchButton();
			driver.close();
								
	}
	
}
