package colabs1_March_26_2026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath_CssSelector_Homework_March_25_2023 {

	public WebDriver driver;
	
	@BeforeMethod
	public void Url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.rediff.com/");
	}
	
	//a[@class = 'mailicon']
	//a[@title = 'Lightning fast free email']
	//a[text() = 'Rediffmail']
	//a[contains(text(), 'Rediffmail')]
	@Test
	public void rediffHead() {
		//REDIFFMAIL
	//	driver.findElement(By.xpath("//div[@class ='cell topicons']/descendant::a[1]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'logobar']/descendant::a[text() = 'Rediffmail']")).click();
	//	driver.findElement(By.xpath("//a[contains(@class, 'mailicon')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/preceding::a[text() = 'Rediffmail']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@class, 'mailicon')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@title, 'Lightning fast free email')]")).click();
	//	driver.findElement(By.xpath("//div[@class= 'srchbar clear-fix relative']/preceding::a[7]")).click();
		
		 //div[@class='cell topicons']/child::a[1]
		//div[@class='cell alignR toprlinks']/preceding::a[5]
		//div[@class='table']/descendant::a[1]
		//div[@class='logobar']/descendant::a[1]
//======================================================================		
		
		//a[@class='moneyicon relative']
		//a[@title= 'Live commentary of the Indian stock markets, stock quotes and business news']
		//a[text()= 'Money']
		//a[contains(text(), 'Money')]
		//MONEY
	// 	driver.findElement(By.xpath("//div[@class ='cell topicons']/descendant::a[2]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'logobar']/descendant::a[text() = 'Money']")).click();
	//	driver.findElement(By.xpath("//a[contains(@class, 'moneyicon relative')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/preceding::a[text() = 'Money']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@class, 'moneyicon relative')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@title, 'Live commentary of the Indian stock markets, stock quotes and business news')]")).click();
	//	driver.findElement(By.xpath("//div[@class= 'srchbar clear-fix relative']/preceding::a[6]")).click();
		
		//div[@class='cell alignR toprlinks']/preceding::a[4]
		//div[@class='cell']/following-sibling::div/child::a[2]
		//div[@class='cell topicons']/child::a[2]
		//div[@class='table']/descendant::a[2]
		//div[@class='logobar']/descendant::a[2]


//======================================================================		
		//Business Email
		//a[@class='bmailicon relative']
		//a[@title='Lightning fast business email hosting']
		//a[text()='Business Email']
		//a[contains(text(), 'Business Email')]
		
	//	driver.findElement(By.xpath("//div[@class ='cell topicons']/descendant::a[3]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'logobar']/descendant::a[text() = 'Business Email']")).click();
	//	driver.findElement(By.xpath("//a[contains(@class, 'bmailicon relative')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/preceding::a[text() = 'Business Email']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@class, 'bmailicon relative')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@title, 'Lightning fast business email hosting')]")).click();
	//	driver.findElement(By.xpath("//div[@class= 'srchbar clear-fix relative']/preceding::a[5]")).click();

		
//======================================================================		
		//Videos
		//a[@class= 'vdicon']
		//a[@title= 'Watch videos']
		//a[text()= 'Videos']
		//a[contains(text(), 'Videos')]
		
	//	driver.findElement(By.xpath("//div[@class ='cell topicons']/descendant::a[4]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'logobar']/descendant::a[text() = 'Videos']")).click();
	//	driver.findElement(By.xpath("//a[contains(@class, 'vdicon')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/preceding::a[text() = 'Videos']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@class, 'vdicon')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@title, 'Watch videos')]")).click();
	//	driver.findElement(By.xpath("//div[@class= 'srchbar clear-fix relative']/preceding::a[4]")).click();
		
//======================================================================
		//	Shopping
		//a[@class= 'shopicon relative']
		//a[@title= 'Online Shopping']
		//a[text()= 'Shopping']
		//a[contains(text(), 'Shopping')]
		
	//	driver.findElement(By.xpath("//div[@class ='cell topicons']/descendant::a[5]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'logobar']/descendant::a[text() = 'Shopping']")).click();
	//	driver.findElement(By.xpath("//a[contains(@class, 'shopicon relative')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/preceding::a[text() = 'Shopping']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@class, 'shopicon relative')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell topicons']/descendant::a[contains (@title, 'Online Shopping')]")).click();
	//	driver.findElement(By.xpath("//div[@class= 'srchbar clear-fix relative']/preceding::a[3]")).click();
		
//======================================================================
		//Sign In
		//a[@class = ‘signin’]
		//a[@title='Already a user? Sign in']
		//a[contains(text(), ‘Sign in’)]
		//a[text() = ‘Sign in’]
		
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[text() = 'Sign in']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[1]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[contains (text(), 'Sign in')]")).click();
	//	driver.findElement(By.xpath("//p[@id = 'signin_info']/descendant::a[contains (text(), 'Sign in')]")).click();
	//	driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[1]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[contains (@class, 'signin')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[contains (@title, 'Already a user? Sign in')]")).click();
	//	driver.findElement(By.xpath("//div[@class= 'srchbar clear-fix relative']/preceding::a[2]")).click();
		

//======================================================================		
		//Create Account
		//a[@title='Create Rediffmail Account']
		//a[text()='Create Account']
		//a[contains(text(), 'Create Account')]
		
	//	driver.findElement(By.xpath("//div[@class= 'srchbar clear-fix relative']/preceding::a[1]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[contains(text(), 'Create Account')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[contains (@title, 'Create Rediffmail Account')]")).click();
	//	driver.findElement(By.xpath("/div[@class = 'cell alignR toprlinks']/descendant::a[text() = 'Create Account']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'cell alignR toprlinks']/descendant::a[2]")).click();
	//	driver.findElement(By.xpath("//p[@id = 'signin_info']/descendant::a[contains (text(), 'Create Account')]")).click();
	//	driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[2]")).click();
		

//======================================================================		
		//Footer Elements (BOTTOM)
		//Investors
		//a[text()= 'Investors']
		//a[contains(text(), 'Investors')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[1]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[1]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Investors')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Investors']")).click();
		//div[@class = 'footer alignC']/child::a[contains(text(), 'Investors')]

		

//======================================================================		
		//Advertise with us
		//a[text()= 'Advertise with us']
		//a[contains(text(), 'Advertise with us')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[2]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[2]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Advertise with us']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Advertise with us')]")).click(); 
		//div[@class = 'footer alignC']/child::a[contains(text(), 'Advertise with us')]

		
//======================================================================
		//Disclaimer
		//a[text()= 'Disclaimer']
		//a[contains(text(), 'Disclaimer')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[3]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[3]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Disclaimer')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Disclaimer']")).click();
		//div[@class = 'footer alignC']/child::a[contains(text(), 'Disclaimer')]
		

//======================================================================		
		//Privacy
		//a[text()= 'Privacy']
		//a[contains(text(), 'Privacy')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[4]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[4]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Privacy']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Privacy')]")).click();
		//div[@class = 'footer alignC']/child::a[contains(text(), 'Privacy')]
		
		
//======================================================================
		//Rediff Labs
		//a[text()= 'Rediff Labs']
		//a[contains(text(), 'Rediff Labs')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[5]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[5]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Rediff Labs')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Rediff Labs']")).click();
		//div[@class = 'footer alignC']/child::a[contains(text(), 'Rediff Labs')]
		

//======================================================================		
		//Sitemap
		//a[text()= 'Sitemap']
		//a[contains(text(), 'Sitemap')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[6]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[6]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Sitemap']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Sitemap')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(@title, 'Sitemap.xml')]")).click();
		//div[@class = 'footer alignC']/child::a[contains(text(), 'Sitemap')]
		
//======================================================================		
	//	Feedback
		//a[text()= 'Feedback']
		//a[contains(text(), 'Feedback')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[7]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[7]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Feedback')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Feedback']")).click();
		//div[@class = 'footer alignC']/child::a[contains(text(), 'Feedback')]
		
//======================================================================		
		
		//Contact Us
		//a[text()= 'Contact Us']
		//a[contains(text(), 'Contact Us')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[8]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[8]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text() = 'Contact Us']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Contact Us')]")).click();
	
		
//======================================================================		
		//About Us
		//a[text()= 'About us']
		//a[contains(text(), 'About us')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[9]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[9]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'About us')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text()= 'About us']")).click();
	
//======================================================================		
		
		//Terms of use
		//a[text()= 'Terms of use']
		//a[contains(text(), 'Terms of use')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[10]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[10]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text()= 'Terms of use']")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Terms of use')]")).click();
		
		
//======================================================================		
		//Grievances
		//a[text()= 'Grievances']
		//a[contains(text(), 'Grievances')]
		
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/child::a[11]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[11]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[contains(text(), 'Grievances')]")).click();
	//	driver.findElement(By.xpath("//div[@class = 'footer alignC']/descendant::a[text()='Grievances']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
