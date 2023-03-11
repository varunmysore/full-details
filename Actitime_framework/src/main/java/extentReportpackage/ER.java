package extentReportpackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ER {
	public static ExtentReports getReport() {
	String path = System.getProperty("user.dir")+"\\output\\index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("extnt document");
	reporter.config().setReportName("extnt report");
	
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("tester", "rahul");
	return extent;
	
	
	}

	
}
