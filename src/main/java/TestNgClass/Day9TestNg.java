package TestNgClass;

import org.testng.annotations.*;

public class Day9TestNg {
	
	@BeforeSuite
	private void beforeSuite() {
		
		System.out.println("Before Suite");
	}
	@AfterSuite	
    private void afterSuite() {
		
		System.out.println("After Suite");
	}
	
	@BeforeTest
	private void beforeTest() {
		
		System.out.println("Before Test");
	}
	@AfterTest	
    private void afterTest() {
		
		System.out.println("After Test");
	}
	@BeforeGroups
	private void beforeGroup() {
		
		System.out.println("Before Group");
	}
	@AfterGroups	
    private void afterGroup() {
		
		System.out.println("After Group");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		
		System.out.println("Before Method");
	}
	@AfterMethod	
    private void afterMethod() {
		
		System.out.println("After Method");
	}
	@BeforeClass
	private void beforeClass() {
		
		System.out.println("Before Class");
	}
	@AfterClass
    private void afterClass() {
		
		System.out.println("After Class");
	}
	
@Test
    private void test1() {
		
		System.out.println("Test1 business logic");
	}

@Test
private void test2() {
	
	System.out.println("Test2 business logic");
}

}
