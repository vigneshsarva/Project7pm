package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	WebDriver driver;
	//Browser type
	public void getDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("chromer")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viki\\eclipse-workspace\\SelenumFirstday\\driver1\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Viki\\eclipse-workspace\\SelenumFirstday\\driver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
	}
	
			// launch url
	
	public void launchUrl(String Url) {
		driver.get(Url);
	}
	
	// send keys
	
	public void typeText(WebElement element, String data) {
		
		element.sendKeys(data);
		
		
	}
	//click 
	
	public void btnClick(WebElement element) {
		element.click();
	}
	
	}
	

