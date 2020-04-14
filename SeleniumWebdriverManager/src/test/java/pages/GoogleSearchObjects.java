package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchObjects {
	
	WebDriver driver = null;
	
	By text2search = By.name("q");
	By enterButton = By.name("btnK");
	
	public GoogleSearchObjects(WebDriver driver) {

		this.driver = driver;
	}

	public void googleSearch(String text) {
		
		driver.findElement(text2search).sendKeys(text);		

	}
	
	public void enterSearch() {
		
		driver.findElement(enterButton).sendKeys(Keys.RETURN);
	}

}
 