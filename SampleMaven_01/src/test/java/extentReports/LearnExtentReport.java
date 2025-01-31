package extentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReport {
	@Test
	public void createReport() {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		//step1: create instance of ExtentSparkReporter
		//ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/ExtentReport.html");
		//to attach time stamp to the report is the below code
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/"+timestamp+"extRep.html");
		//step2: create instance of ExtentReports
		ExtentReports extReport = new ExtentReports();
		
		//step3: attach ExtentSparkReporter to ExtentReports
		extReport.attachReporter(spark);
		
		//step4: create instance of ExtentTest
		ExtentTest test = extReport.createTest("createReport");
		
		//step5:call log() to provide status and message
		test.log(Status.PASS, "message added into the report");
		test.log(Status.INFO, "adding Info Status");
		
		//step6:call flush
		extReport.flush();
	}

}
