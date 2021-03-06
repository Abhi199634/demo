package listeners;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.java.base;

public class listeners implements ITestListener {
	
	base b= new base();

	public void onTestFailure(ITestResult result) {
		
		try{b.getScreenshot(result.getName());
		System.out.println(result);
		}catch(NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}