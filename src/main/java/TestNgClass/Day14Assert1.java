package TestNgClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14Assert1 {

	@Test
	public void test1() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test3() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
}
