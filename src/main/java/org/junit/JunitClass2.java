package org.junit;

import java.util.Date;

import org.base.BaseClassNew;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.LoginPojoPage;
import org.pojo.PojoPage;

public class JunitClass2 extends BaseClassNew {
	public static WebDriver driver;
	
	
	@BeforeClass
	
	public static void beforeClass() {
		
     System.out.println("BeforeClass-->driver and url initialization");	

      getDriver();
      launchUrl("https://www.facebook.com/");
      String CurrentUrl = getCurrenturl();
      
      Assert.assertTrue("HomePage is not match", CurrentUrl.contains("facebook"));
      
	}

	@AfterClass
	
	public static void afterClass() {
		
		System.out.println("AfterClass-->driver tear down");
		closeBrowser();
					
	}
	
	@After
	
	public void after() {
		
		System.out.println("After-->Ending execution time");
		getDate();
	}

	@Before
	
	public void before() {
		System.out.println("BeforeClass-->Starting time of execution");
		getDate();
		
	}
	
	@Test
	
	public void test1() {
		
		System.out.println("Test1 business logic");
		
		insertType(new LoginPojoPage().getTxtUser(),"Hello");
		
		//String attribute = getAttribute(new LoginPojoPage().getTxtUser(),"value");
		
		String attribute2 = getAttribute(new LoginPojoPage().getTxtUser(),"value");		
		
		Assert.assertEquals("usernme is not matched","Hello", attribute2);
	
	
         insertType(new LoginPojoPage().getTxtpass(),"234567");
		
		String attribute1 = getAttribute(new LoginPojoPage().getTxtpass(),"value");
		
		Assert.assertEquals("password not match","234567",attribute1);
	
	}
	

	@Test
	public void test2() throws InterruptedException {
		
		System.out.println("Test2 business logic");
		click(new LoginPojoPage().getBtnLogin());
		
		//Thread.sleep(3000);
		
		getWait(3000);
		
		Assert.assertTrue("not navigated to login fail page",getCurrenturl().contains("login"));
		
}
}