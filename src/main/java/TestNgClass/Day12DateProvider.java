package TestNgClass;

import org.base.BaseClassNew;
import org.pojo.LoginPojoPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day12DateProvider extends BaseClassNew {

	@DataProvider(name = "login")
	public Object[][] dpmethod(){
		return new Object [][] {{"Hello","234567"},{"Selenium","345678"}};
		
	}
	
	@Test(dataProvider = "login")
	private void test1(String s1, String s2) {
		getDriver();
		launchUrl("https://www.facebook.com/");
		insertType(new LoginPojoPage().getTxtUser(),s1);
		insertType(new LoginPojoPage().getTxtpass(),s2);
		click(new LoginPojoPage().getBtnLogin());
		closeBrowser();
		
	}
}
