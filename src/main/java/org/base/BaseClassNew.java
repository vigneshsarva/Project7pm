package org.base;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClassNew {
	
public static WebDriver driver;

public static void getDriver() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viki\\eclipse-workspace\\SelenumFirstday\\driver1\\chromedriver.exe");
	driver = new ChromeDriver();
		
}

public static void getChromerDriver() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viki\\eclipse-workspace\\SelenumFirstday\\driver1\\chromedriver.exe");
	driver = new ChromeDriver();
		
}
public static void getEdgeDriver() {
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Viki\\eclipse-workspace\\SelenumFirstday\\driver\\msedgedriver.exe");
	driver = new EdgeDriver();
		
}
public static void MaximizeWindow() {
	driver.manage().window().maximize();
	
}

public static String getTitle() {
	
	return driver.getTitle();
}

public static String getCurrenturl() {
	
	return driver.getCurrentUrl();
}

public static void launchUrl(String url) {
	
	driver.get(url);
}


public static void insertType(WebElement ele,String Value) {
	ele.sendKeys(Value);
	
}

public static void click(WebElement elem) {
	
	elem.click();
}

public static void closeBrowser() {
	driver.close();
}

public static void getDate() {
	Date d = new Date();
	System.out.println(d);
	
}

public static void getWait(long millis) throws InterruptedException {
Thread.sleep(millis);
	
}


public static String getAttribute(WebElement s,String value) {
	return s.getAttribute(value); 
	
}
//dropdown base class doubt

 public static void selectDropDown(WebElement drop , int val) {
	 
	Select s = new Select(drop);
	s.selectByIndex(val);
		 
		
}

 public static void selectValue(WebElement drop1 , String i) {
	 
	Select s1 = new Select(drop1);
	s1.selectByValue(i);
	 
		
}
 
 public static void selectVisible (WebElement drop2 , String val2) {
 
 Select s2 = new Select(drop2);
	s2.selectByVisibleText(val2);

}
}

