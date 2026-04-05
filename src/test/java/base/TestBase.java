package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class TestBase {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();   // Abstraction: WebDriver interface
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
		if (driver != null) {
            driver. quit();
        }
		
	} 

}
