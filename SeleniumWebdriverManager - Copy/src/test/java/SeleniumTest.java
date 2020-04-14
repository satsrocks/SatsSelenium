import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {

		googleSearch();

	}

	static void googleSearch() {

		WebDriverManager.chromedriver().setup();
		/*
		WebDriverManager.chromedriver().version("2.36").setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		 */

		WebDriver driver = new ChromeDriver();

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
