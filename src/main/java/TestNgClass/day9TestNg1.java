package TestNgClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day9TestNg1 {
	@Test(priority = 5)
	public void test1() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

	@Test(priority = 5, invocationCount =5)
	public void test2() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test(enabled=false)
	public void test3() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

}
