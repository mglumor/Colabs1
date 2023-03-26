package colabs1_March_26_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class xpath_homework_20March_2023 {
	public WebDriver driver;
	public ChromeOptions options; 
	
	@BeforeMethod
	public void openBrowser() throws InterruptedException {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		Thread.sleep(1000);	
	}
	@Test
	public void TabClicks() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class = 'mailicon']")).click();
		Thread.sleep(1000);		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class = 'moneyicon relative']")).click();	
		Thread.sleep(1000);		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class = 'bmailicon relative']")).click();
		Thread.sleep(1000);		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class = 'vdicon']")).click();		
		Thread.sleep(1000);		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@class = 'shopicon relative']")).click();
		Thread.sleep(1000);		
		driver.navigate().back();
	
		driver.findElement(By.xpath("//input[contains(@id, 'srchword')]")).sendKeys("Banks");
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//input[contains (@id, 'srchquery_tbox')]")).sendKeys("Banks");

		driver.findElement(By.partialLinkText("Create Acc")).click();
		Thread.sleep(1000);	
		driver.navigate().back();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name = 'login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@name = 'passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@title = 'Sign in']")).click();
		driver.findElement(By.xpath("//a[@class = 'rd_setting_panel']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.partialLinkText("Account In")).click();
		driver.findElement(By.linkText("Change Password")).click();
		driver.findElement(By.xpath("//input[@id = 'oldpasswd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'newpasswd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id = 'newpasswd1']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		
	
	}
}
