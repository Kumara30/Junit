package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook1 {

	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
					
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
		WebElement  txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Java");
		String name = txtuser.getAttribute("value");
		Assert.assertEquals("Java", name);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("hello");
		String pass=txtpass.getAttribute("value");
		Assert.assertEquals("hello", pass);
		
		WebElement btnlogin	= driver.findElement(By.xpath("(//input[@value=\"Log In\"])"));
		btnlogin.click();
	}
}
