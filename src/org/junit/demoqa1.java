package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqa1 
{
public static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/registration/");
		//Assert.assertTrue(driver.getTitle().contains("demoqa"));
					
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
		WebElement txtfirst = driver.findElement(By.name("first_name"));
		txtfirst.sendKeys("Kumar");
		String name1 = txtfirst.getAttribute("value");
		Assert.assertEquals("Kumar", name1);
		
		WebElement txtlastname = driver.findElement(By.name("last_name"));
		txtlastname.sendKeys("Kumar");
		String name2 = txtlastname.getAttribute("value");
		Assert.assertEquals("Kumar", name2);
		
		WebElement txtmaritalstatus = driver.findElement(By.xpath("//input[@value=\"single\"]"));
		txtmaritalstatus.click();
		
		WebElement txthobby = driver.findElement(By.xpath("//input[@value=\"cricket \"]"));
		txthobby.click();
		
		WebElement ddlcountry = driver.findElement(By.id("dropdown_7"));
		ddlcountry.sendKeys("India");
		String name3 = ddlcountry.getAttribute("value");
		Assert.assertEquals("India", name3);
		
		
		
		WebElement txtphone = driver.findElement(By.xpath("//input[@id=\"phone_9\"]"));
		txtphone.sendKeys("8125434676");
		String name4 = txtphone.getAttribute("value");
		Assert.assertEquals("8125434676", name4);
		
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("akumar.nan");
		String name5 = txtuser.getAttribute("value");
		Assert.assertEquals("akumar.nan", name5);
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@id=\"email_1\"]"));
		txtemail.sendKeys("akumar.nan@gmail.in");
		String name6 = txtemail.getAttribute("value");
		Assert.assertEquals("akumar.nan@gmail.in", name6);
		
		WebElement txtdesc = driver.findElement(By.id("description"));
		txtdesc.sendKeys("OMR , Chennai , Tamil Nadu");
		String name7 = txtdesc.getAttribute("value");
		Assert.assertEquals("OMR , Chennai , Tamil Nadu", name7);
		
		WebElement txtpwd = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		txtpwd.sendKeys("jes123456");
		String name8 = txtpwd.getAttribute("value");
		Assert.assertEquals("jes123456", name8);
		
		WebElement txtcpwd = driver.findElement(By.xpath("//input[@id=\"confirm_password_password_2\"]"));
		txtcpwd.sendKeys("jes123456");
		String name9 = txtcpwd.getAttribute("value");
		Assert.assertEquals("jes123456", name9);
	}

}
