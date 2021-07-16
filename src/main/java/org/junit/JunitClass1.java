package org.junit;

import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JunitClass1 {
	
	public static WebDriver driver;
	
	
	@BeforeClass
	
	public static void beforeClass() {
		
     System.out.println("BeforeClass-->driver and url initialization");	

      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Viki\\eclipse-workspace\\SelenumFirstday\\driver1\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
	}

	@AfterClass
	
	public static void afterClass() {
		
		System.out.println("AfterClass-->driver tear down");
		driver.close();
			
	}
	
	@After
	
	public void after() {
		
		System.out.println("After-->Ending execution time");
		Date d = new Date();
		System.out.println(d);
	}

	@Before
	
	public void before() {
		System.out.println("BeforeClass-->Starting time of execution");
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@Test
	
	public void test1() {
		
		System.out.println("Test1 business logic");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("vignesh");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("1234567");
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test2 business logic");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}
	
}
