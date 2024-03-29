package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchObjects;

public class GoogleSearchObjectsTestNG1 {

	WebDriver driver = null;
	GoogleSearchObjects search = null;

	@BeforeTest
	public void testSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Start here . . ");
	}

	@Test
	public void googleSearchTest1(){

		driver.get("https://google.com");
		search = new GoogleSearchObjects(driver);
		
		search.googleSearch("pakoda");
		System.out.println("Come in  here . . ");
		driver.manage().window().maximize();
		search.enterSearch();
		System.out.println("and here . . ");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("TestNG Success . . ");
	}

}
