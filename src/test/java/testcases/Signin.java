package testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.landingpage;
import pageObjects.signin;
import resources.java.base;
import resources.java.hashmap;

public class Signin extends base {
	
	@BeforeTest
	public void initilize() throws IOException {
		
	driver = initializedriver();
	}
@Test(priority=1)   		 
public  void basepageNavigation() throws IOException{
		
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		landingpage l= new landingpage(driver);
		l.getlogin().click();
}



@Test(priority=2)
public void getUrl() throws IOException {
	String strUrl = driver.getCurrentUrl();
	System.out.println(strUrl);
	Assert.assertEquals(strUrl,"https://letsventure.com/join" );
}

@Test(priority=3)
public void signin() throws IOException {
	
	hashmap h= new hashmap();
	String investorCredential= h.getUserlogininfo().get("startup");
	
	String investorinfo[]= investorCredential.split("_");
	
	signin s = new signin(driver);
	s.Email().sendKeys(investorinfo[0]);
	s.Password().sendKeys(investorinfo[1]);
	s.Submit().click();
}

}
