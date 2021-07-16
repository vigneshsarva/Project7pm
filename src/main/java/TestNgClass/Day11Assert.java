package TestNgClass;

import org.base.BaseClassNew;
import org.pojo.LoginPojoPage;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

public class Day11Assert extends BaseClassNew {
	
	@BeforeClass
	private void beforeClass() {
		getDriver();
		launchUrl("https://www.facebook.com/");
		String currentUrl = getCurrenturl();
		boolean b = currentUrl.contains("facebook");
		Assert.assertTrue(b,"current url not matched");
	}
@AfterClass
private void afterClass() {
	closeBrowser();
	
}

@Parameters({"userName","password"})
@Test
private void test1(String s1, String s2) {
	SoftAssert s = new SoftAssert();
	insertType(new LoginPojoPage().getTxtUser(),s1);
	s.assertEquals(getAttribute (new LoginPojoPage().getTxtUser(),"value"),"selenium","user name not match");
	insertType(new LoginPojoPage().getTxtpass(),s2);
	s.assertEquals(getAttribute(new LoginPojoPage().getTxtpass(),"value"), "12345678","password not match");
	click(new LoginPojoPage().getBtnLogin());
	s.assertAll();
}

@BeforeMethod
private void beforeMethod() {
	getDate();
}

@AfterMethod
private void aftermethod() {
	getDate();
}
}
