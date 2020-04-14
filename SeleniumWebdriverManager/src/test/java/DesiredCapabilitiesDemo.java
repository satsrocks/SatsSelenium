import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {

		WebDriverManager.iedriver().setup();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriver driver = new InternetExplorerDriver(caps); 
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(); 
		

		driver.get("https://google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("TOI");
		System.out.println("Hit Search now");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();

	}

}
