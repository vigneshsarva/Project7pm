package org.junit;


public class Class2 {
	
	@Test
	public void test1() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

	@Ignore
	@Test
	public void test2() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test
	public void test4() {
		
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}

}
