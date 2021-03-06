package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	
	public WebDriver driver;
	By Signin= By.xpath("/html/body/header/div/div/nav/div/div/a[4]");
	By Signup= By.xpath("/html/body/header/div/div/nav/div/div/a[5]");
	By Product_services= By.xpath("//*[@id=\"dropdownMenuButton\"]");
	By Corosel_back= By.xpath("/html/body/section[1]/div/div/div[2]/a[1]/span[1]");
	By Corosel_forward= By.xpath("/html/body/section[1]/div/div/div[2]/a[2]/span[1]");
	By invest_now= By.xpath("/html/body/section[1]/div/div/div[1]/div[3]/div/div[1]/div[2]/a[1]");
	
	public landingpage(WebDriver driver) {
		
		this.driver= driver;
	}
	public WebElement getlogin() {
		
		return driver.findElement(Signin);
	}
	public WebElement createlogin() {
		
		return driver.findElement(Signup);
		
	}
	
	public WebElement Product() {
		
		return driver.findElement(Product_services);
	}
	public WebElement next() {
		
		return driver.findElement(Corosel_forward);
		
	}
	public WebElement back() {
		
		return driver.findElement(Corosel_back);
		
	}
	public WebElement invest() {
		
		return driver.findElement(invest_now);
	}
	
}
	

