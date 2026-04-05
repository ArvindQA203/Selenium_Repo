package page;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	
	private WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    // Encapsulation: private locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton   = By.id("login-button");
    		By threedotlogbutt = By.xpath("(//button[@type=\"button\"])[1]");
    		By logoutbutton = By.xpath("//a[@id=\"logout_sidebar_link\"]");
 
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
 
    // Public methods hide implementation details
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
 
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
 
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    public static void alertHandle(WebDriver driver) {
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    }
    public void threedotbt() {
        //driver.findElement(threedotlogbutt).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(threedotlogbutt)).click();
    }
    public void logoutbutton() {
        //driver.findElement(logoutbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutbutton)).click();
    }
    
    public void logoutbutton1() {
        //driver.findElement(logoutbutton).click();
        wait.until(ExpectedConditions.elementToBeClickable(logoutbutton)).click();
    }
    public void threedotbt1() {
        //driver.findElement(threedotlogbutt).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(threedotlogbutt)).click();
    }
}
