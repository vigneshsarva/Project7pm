package TestNgClass;

import org.base.BaseClassNew;
import org.pojo.LoginPojoPage;
import org.testng.annotations.*;

public class Day10Parameter extends BaseClassNew {

	@BeforeClass
	private void beforeClass() {
		
		getDriver();
		launchUrl("https://www.facebook.com/");
	}
	
	@AfterClass
	private void afterClass() {
		closeBrowser();
	}
		
	//@Test
//	private void test1() {
		
	//	insertType(new LoginPojoPage().getTxtUser(),"Hello");
	//	insertType(new LoginPojoPage().getTxtpass(),"234567");
	//	click(new LoginPojoPage().getBtnLogin());
//	}
	
	// calling from testng.xml we need to give the below conditions
	
	@Parameters({"userName","password"})
	@Test
	private void test1(@Optional("Hello") String s1,String s2) {
		
		insertType(new LoginPojoPage().getTxtUser(),s1);
		insertType(new LoginPojoPage().getTxtpass(),s2);
		click(new LoginPojoPage().getBtnLogin());
	}
	
	@BeforeMethod
	private void beforeMethod() {
		
		getDate();
	}
	
	@AfterMethod
	
	private void afterMethod() {
		
		getDate();
	}
	
	
}
