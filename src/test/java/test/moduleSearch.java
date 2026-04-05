package test;

import org.testng.annotations.Test;

public class moduleSearch {

	
	@Test
	public void testcase1() {

	System.out.println("Module search");
}
	
	
	@Test(groups = {"UAT,Regression"})
	public void testcase2() {

		System.out.println("Module search");
	}
	
	@Test
	public void testcase3() {

		System.out.println("Module search");
	}
	
	@Test(groups = {"Integration"})
	public void testcase4() {

		System.out.println("Module search");
	}
	
	
	@Test
	public void testcase5() {

		System.out.println("Module search");
	}
}
