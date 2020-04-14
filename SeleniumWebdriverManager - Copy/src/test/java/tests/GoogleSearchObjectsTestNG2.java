package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.GoogleSearchObjects;

public class GoogleSearchObjectsTestNG2 {

	WebDriver driver = null;
	GoogleSearchObjects search = null;

	@BeforeSuite
	public void setUpSuite() {
		WebDriverManager.chromedriver().setup();
	}

	@BeforeTest
	public void testSetup() {

		driver = new ChromeDriver();
		search = new GoogleSearchObjects(driver);
		System.out.println("1111111111111");
	}

	@Test
	public void googleSearchTest2(){

		driver.get("https://google.com");
		search = new GoogleSearchObjects(driver);

		search.googleSearch("pakoda");
		System.out.println("22222222222");
		driver.manage().window().maximize();
		search.enterSearch();
		System.out.println("333333333333");
	}

	@Test
	public void googleSearchTest3(){

		driver.get("https://google.com");
		search = new GoogleSearchObjects(driver);
		
		search.googleSearch("pakoda");
		System.out.println("4444444444444444");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println("456789456789");
		search.enterSearch();
		System.out.println("555555555555555");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		System.out.println("666666666666666");
	}

	@AfterSuite
	public void tearDownSuite() {
		driver.quit();
		System.out.println("77777777777777");
	}

}
