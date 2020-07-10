package MyTestPages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.ITestInvoker;

import com.google.common.io.Files;

public class MyListener extends BaseT implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" TEST START", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" SUSSESSSSS", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedMethod=result.getName();
		Reporter.log(failedMethod+" FAILED",true);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+failedMethod+".png");
		try
		{
			Files.copy(src,dest);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" Skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log(result.getName()+" TimeOUT", true);	
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" Started", true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" Finished", true);
	}
	
	
}
	


