package colabs1_March_26_2026;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Class_Assignment_March_12_2023 {
	 public WebDriver driver;
	 public ChromeOptions options;
	 
	 @BeforeMethod
	 public void setUp() {
		 options = new ChromeOptions();
		 options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 options.addArguments("--start-maximized");
		 options.addArguments("--incognito");
		 options.addArguments("--remote-allow-origions=*");
		 driver = new ChromeDriver(options);
		 driver.get("http://tutorialsninja.com");		 
	 }
	 
	 @Test
	 public void validatingLoginWithValidCredential() {
		 driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		 driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		 driver.findElement(By.cssSelector("input.btn btn-primary")).click();
		 
		 // WONT WORK since it is a class compound:: driver.findElement(By.className("btn btn-primary")).click();
		 // class compound works great with Xpath and cssSelector
		 //we use other location options
		 // Xpath and cssSelector
	 }
	 
	 @AfterMethod
	 public void tearDown() {
			driver.manage().deleteAllCookies();
			driver.quit();
	 }
}
