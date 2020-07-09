import java.awt.List;
import java.io.PrintWriter;
import java.security.Identity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
public static void main(String[] args) {
	
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
	
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\SREEJA\\workspace\\SeleniumJavaProject\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver",projectPath+"/Drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
	
		driver.get("http://google.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("abcd");
		java.util.List<WebElement> listofInputElements = driver.findElements(By.xpath("//input"));
		int count = listofInputElements.size();
		System.out.println("count of input elements = " +count);
		driver.close();
	}
}

