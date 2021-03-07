package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import resources.java.base;

public class signup extends base{
	
@BeforeTest
public void initilize() throws IOException {
		
		driver= initializedriver();
}
@Test
public  void createsignup() throws IOException{
	
	driver.get(baseurl);
	driver.manage().window().maximize();
	landingpage l= new landingpage(driver);
	l.createlogin().click();
}
@Test
public void getUrl() throws IOException {
	String strUrl = driver.getCurrentUrl();
	System.out.println(strUrl);
	Assert.assertEquals(strUrl,"https://letsventure.com/signup" );
}
}
