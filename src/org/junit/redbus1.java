package org.junit;

import java.util.Date;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus1 
{
public static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
	//	Assert.assertTrue(driver.getTitle().contains("redbus"));
					
	}
	@AfterClass
	public static void afterclass() 
	{
		driver.quit();
	}
	
	@Before
	public void beforemethod() 
	{
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void aftermethod() 
	{
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void test1() 
	{
		WebElement btnsignin = driver.findElement(By.id("signin-block"));
		btnsignin.click();
			
		WebElement  btnsign = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		btnsign.click();
		
		driver.switchTo().frame(0);
		
	//	WebElement btnsignred =  driver.findElement(By.xpath("//button[text()='signup with email']"));
	//	btnsignred.click();
		
		/*txtuser.sendKeys("Java");
		String name = txtuser.getAttribute("value");
		Assert.assertEquals("Java", name);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("hello");
		String pass=txtpass.getAttribute("value");
		Assert.assertEquals("hello", pass);
		
		WebElement btnlogin	= driver.findElement(By.xpath("(//input[@value=\"Log In\"])"));
		btnlogin.click();
		*/
	}

	

}
