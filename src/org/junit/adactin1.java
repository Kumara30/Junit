package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin1 
{
	public static WebDriver driver;

	@BeforeClass
	public static void beforeclass() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Testing\\Junit\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		//Assert.assertTrue(driver.getTitle().contains("adactin.com"));
					
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
		WebElement txtadauser = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		txtadauser.sendKeys("kumarjes30");
		String s1 = txtadauser.getAttribute("value");
		Assert.assertEquals("kumarjes30", s1);
		
		WebElement txtadapwd = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		txtadapwd.sendKeys("7C903H");
		String s2 = txtadapwd.getAttribute("value");
		Assert.assertEquals("7C903H", s2);
		
		WebElement btnadalogin = driver.findElement(By.xpath("//input[@id=\"login\"]"));
		btnadalogin.click();
		
		
		WebElement ddloc = driver.findElement(By.xpath("//select[@id=\"location\"]"));
		ddloc.sendKeys("London");
		String name1 = ddloc.getAttribute("value");
		Assert.assertEquals("London", name1);
		
		WebElement ddhotel = driver.findElement(By.xpath("//select[@id=\"hotels\"]"));
		ddhotel.sendKeys("Hotel Creek");
		String name2 = ddhotel.getAttribute("value");
		Assert.assertEquals("Hotel Creek", name2);
		
		WebElement ddroomtype = driver.findElement(By.xpath("//select[@id=\"room_type\"]"));
		ddroomtype.sendKeys("Double");
		String name3 = ddroomtype.getAttribute("value");
		Assert.assertEquals("Double", name3);
		
		WebElement ddroomno = driver.findElement(By.xpath("//select[@id=\"room_nos\"]"));
		ddroomno.sendKeys("2");
		String name4 = ddroomno.getAttribute("value");
		Assert.assertEquals("2", name4);
		
		WebElement ddadult = driver.findElement(By.xpath("//select[@id=\"adult_room\"]"));
		ddadult.sendKeys("2");
		String name5 = ddadult.getAttribute("value");
		Assert.assertEquals("2", name5);
		
		WebElement ddchild = driver.findElement(By.xpath("//select[@id=\"child_room\"]"));
		ddchild.sendKeys("1");
		String name6 = ddchild.getAttribute("value");
		Assert.assertEquals("1", name6);
		
		WebElement btnadasearch = driver.findElement(By.xpath("//input[@id=\"Submit\"]"));
		btnadasearch.click();
		
		WebElement rbtnselect = driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]"));
		rbtnselect.click();
		
		WebElement btncontinue = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		btncontinue.click();
		
		WebElement txtfirst = driver.findElement(By.xpath("//input[@id=\"first_name\"]"));
		txtfirst.sendKeys("Kumar");
		String name7 = txtfirst.getAttribute("value");
		Assert.assertEquals("Kumar", name7);
		
		WebElement txtlast = driver.findElement(By.xpath("//input[@id=\"last_name\"]"));
		txtlast.sendKeys("Jes");
		String name8 = txtlast.getAttribute("value");
		Assert.assertEquals("Jes", name8);
		
		WebElement txtbill = driver.findElement(By.xpath("//textarea[@id=\"address\"]"));
		txtbill.sendKeys("OMR ,Chennai");
		String name9 = txtbill.getAttribute("value");
		Assert.assertEquals("OMR ,Chennai", name9);
		
		
		WebElement txtcard = driver.findElement(By.xpath("//input[@id=\"cc_num\"]"));
		txtcard.sendKeys("1012348125434676");
		String name10 = txtcard.getAttribute("value");
		Assert.assertEquals("1012348125434676", name10);
		
		WebElement txtcardtype = driver.findElement(By.xpath("//select[@id=\"cc_type\"]"));
		txtcardtype.sendKeys("VISA");
		String name11 = txtcardtype.getAttribute("value");
		Assert.assertEquals("VISA", name11);
		
		WebElement txtmonth = driver.findElement(By.xpath("//select[@id=\"cc_exp_month\"]"));
		txtmonth.sendKeys("May");
		String name12 = txtmonth.getAttribute("value");
		Assert.assertEquals("May", name12);
		
		WebElement txtyear = driver.findElement(By.xpath("(//select[@id='cc_exp_year'])"));
		txtyear.sendKeys("2020");
		String name13 = txtyear.getAttribute("value");
		Assert.assertEquals("2020", name13);
		
		WebElement txtcvv = driver.findElement(By.xpath("//input[@id=\"cc_cvv\"]"));
		txtcvv.sendKeys("002");
		String name14 = txtcvv.getAttribute("value");
		Assert.assertEquals("002", name14);
		
		WebElement txtbooknow = driver.findElement(By.xpath("//input[@id=\"book_now\"]"));
		txtbooknow.click();
		String name15 =txtbooknow.getAttribute("value");
		System.out.println(name15);
		
		WebElement txtorderno = driver.findElement(By.xpath("//input[@name=\"order_no\"]"));
		String name16 = txtorderno.getAttribute("value");
		System.out.println(name16);
	}
}