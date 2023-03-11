package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListeners implements ITestListener{
@Override
public void onTestFailure(ITestResult result) {
	
		String scriptName = result.getMethod().getMethodName();
}
}
