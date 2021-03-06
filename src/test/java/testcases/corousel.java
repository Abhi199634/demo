//authour Abhishek Gupta

package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import resources.java.base;

public class corousel  extends base{
	
	@BeforeTest
	public void initilize() throws IOException {
		
		driver= initializedriver();
	}
	@Test
	public void crouseltestforward() throws InterruptedException {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		landingpage l= new landingpage(driver);
	
		
		for(int i=0; i<4; i++) {
			
			Thread.sleep(500);
			l.next().click();
			
		}
	}
	@Test(dependsOnMethods = { "crouseltestforward" })
	public void crouseltestbackward() throws InterruptedException {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		landingpage l= new landingpage(driver);
		for(int i=0; i<4; i++) {
		    Thread.sleep(500);
			l.back().click();
		
		}
	}
	
	@Test()
	public void fundlink() {
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		landingpage l= new landingpage(driver);
		l.next().click();
		WebElement fund = driver.findElement(By.xpath("//*[@id=\"homebanner\"]/div[1]/div[2]/div/div[1]/div[2]/a[1]"));
		fund.click();
	}
	
}