package pom.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logintest {
	WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/offline%20website/index.html");
		driver.manage().window().maximize();
	}
	@Test
	public void Test01()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void test02()
	{
		String title=driver.getTitle();
		Assert.assertEquals("JavaByKiran | Dashboard", title);
	}
	

}
