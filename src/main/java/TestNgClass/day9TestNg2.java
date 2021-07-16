package TestNgClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day9TestNg2 {
	@Test()
	public void test1() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

	@Test(groups="sample")
	public void test2() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test(groups="sample")
	public void test3() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	
	@Test(groups="dummy")
	public void test5() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test(groups="dummy")
	public void test6() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
}
