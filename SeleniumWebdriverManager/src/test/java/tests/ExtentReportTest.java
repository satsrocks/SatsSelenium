package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;

public class ExtentReportTest {

	public static void main(String[] args) {
		
		searchGoogle();
		
	}
	
	static void searchGoogle(){
		
		ExtentReports extent = new ExtentReports();
		ExtentLoggerReporter logger = new ExtentLoggerReporter("extRep");
		extent.attachReporter(logger);
		
		ExtentTest test = extent.createTest("MyFirstTest", "Test Description");
		test.pass("Started . . ");
		
		test.log(Status.PASS, "pass here");
		extent.flush();
		
	}
}
