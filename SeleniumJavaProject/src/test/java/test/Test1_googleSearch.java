package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;

public class Test1_googleSearch {
	public static void main(String[] args) {
		googleSearch();
	}

  static void googleSearch() {
	 String projectPath = System.getProperty("user.dir");
	 System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
	   //open the URL google.com
		driver.get("https://google.com");
		
		//enter text  in search box
		driver.findElement(By.name("q")).sendKeys("automation steps");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click(); 
		 driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		//close browser
		driver.close();
		
		System.out.println("test completed");
 }
 
 	
}
 
 