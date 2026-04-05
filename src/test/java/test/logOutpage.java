package test;

import org.testng.annotations.Test;

public class logOutpage {

	
	@Test(groups = {"regression"})
	public  void logoutcase1() {

	System.out.println("logout page");
}
	
	
	@Test(groups = {"smoke, sanity"})
	public  void logoutcase2() {

		System.out.println("logout page");
	}
	
	@Test(groups = {"smoke, UAT"})
	public  void logoutcase3() {

		System.out.println("logout page");
	}
	
	
	@Test(groups = {"smoke"})
	public  void logoutcase4() {

		System.out.println("logout page");
	}
	
	
	@Test(groups = {"smoke, functional"})
	public  void logoutcase5() {

		System.out.println("logout page");
	}
	
	@Test(groups = {"smoke"})
	public  void logoutcase6() {

		System.out.println("logout page");
	}
}
