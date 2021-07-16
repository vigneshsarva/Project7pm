package TestNgClass;

import org.base.BaseClassNew;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day13CrossBrowser extends BaseClassNew {
	
	@Parameters({"Browser"})
	@Test
	private void test1(String s1) {
		
		if(s1.equalsIgnoreCase("chrome")) {
			
			getChromerDriver();
		}else if (s1.equalsIgnoreCase("Edge")){
				getEdgeDriver();
	}
	launchUrl("https://www.facebook.com/");
		
	}

}
