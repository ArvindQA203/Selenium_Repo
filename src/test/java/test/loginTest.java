package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;
import page.Loginpage;

public class loginTest extends TestBase{

	@Test(priority = 1)
	public void loginTestCase() {
	
	Loginpage login = new Loginpage(driver);
	login.enterUsername("standard_user");
	login.enterPassword("secret_sauce");
	login.clickLogin();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	login.alertHandle(driver);
	login.threedotbt();
	login.logoutbutton();
	
	System.out.println("system run succesfully logintest ");
	
}
	@Test(priority = 2)
	public void loginTest2() {
		Loginpage login = new Loginpage(driver);
		login.enterUsername("locked_out_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
			login.threedotbt();
		login.logoutbutton();
		
		System.out.println("system run succesfully logintest2 ");
	}
	
	@Test(enabled=true)
	public void loginTest3() {
		Loginpage login = new Loginpage(driver);
		login.enterUsername("problem_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
		login.threedotbt();
		login.logoutbutton();
		
		System.out.println("system run succesfully logintest3 ");
		
	}
	@Test(priority=3)
	public void loginTest4() {
		Loginpage login = new Loginpage(driver);
		login.enterUsername("performance_glitch_user");
		login.enterPassword("secret_sauce");
		login.clickLogin();
			login.threedotbt();
		login.logoutbutton();
		
		System.out.println("system run succesfully logintest4 ");
	}

}
