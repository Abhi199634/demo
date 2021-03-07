package listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.java.base;

public class listeners implements ITestListener {
	
	base b= new base();

	public void onTestFailure(ITestResult result) throws NullPointerException {
		
		try{b.getScreenshot(result.getName());
		System.out.println(result);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	
	
}