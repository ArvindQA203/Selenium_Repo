package handsOn;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceSession {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	     // Navigate to Url
	     driver.get("https://www.testmuai.com/selenium-playground/checkbox-demo/");
	 
	     // Click on the element
	     WebElement checkInput = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	     checkInput.click();
	     //Boolean isChecked = checkInput.isSelected();
	   //  assertEquals(isChecked, false);
	     driver.quit();
	     // SendKeys
	     // Clear field to empty it from any previous data
	   //  WebElement emailInput = driver.findElement(By.name("email_input"));
	   //  emailInput.clear();
	     // Enter Text
	   //  String email = "admin@localhost.dev";
	    // emailInput.sendKeys(email);
	     // Verify
	   //  String data = emailInput.getAttribute("value");
	   //  assertEquals(data, email);
	 
	     // Clear Element
	     // Clear field to empty it from any previous data
	   //  emailInput.clear();
	   //  data = emailInput.getAttribute("value");
	   //  assertEquals(data, "");
	 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	     driver.quit();

	}

}
