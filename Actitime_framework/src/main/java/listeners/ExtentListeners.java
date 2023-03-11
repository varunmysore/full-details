package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extentReportpackage.ER;
import generic.basetest;

public class ExtentListeners implements ITestListener {
	ExtentTest test;
	ExtentReports extent= ER.getReport();

	@Override
	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		
		String scriptName = result.getMethod().getMethodName();
		String path = basetest.util.captureScreenshot(scriptName);
		test.addScreenCaptureFromPath(path);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

}
