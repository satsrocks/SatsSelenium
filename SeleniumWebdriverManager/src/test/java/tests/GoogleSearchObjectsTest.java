package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchObjects;

public class GoogleSearchObjectsTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		System.out.println("first here . . ");
		googleSearchTest();

	}

	public static void googleSearchTest(){

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://google.com");
		GoogleSearchObjects search = new GoogleSearchObjects(driver);
		
		search.googleSearch("pakoda");
		System.out.println("Then here . . ");
		driver.manage().window().maximize();
		search.enterSearch();
		System.out.println("and here . . ");
		
		driver.close();
		driver.quit();
	}

}
