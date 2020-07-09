package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
		WebDriver driver = null;
		
		By text_search =  By.name("q");
		By button_click = By.name("btnK");
		
			public GoogleSearchPageObjects(WebDriver driver) {
				this.driver=driver;
			}
		
			public void setTextInSearchBox(String text) {
				driver.findElement(text_search).sendKeys(text);
					}
			
			public void clickSearchButton() {
				driver.findElement(button_click).sendKeys(Keys.RETURN);
			}

}
