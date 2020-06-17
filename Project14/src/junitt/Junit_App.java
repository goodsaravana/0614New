package junitt;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junit_App 
{
	public WebDriver driver;
	@Before
	public void launchApp()
	{
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void closeApp()
	{
		driver.close();
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("Kishore");
		boolean a = driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertEquals(false, a);
		boolean b = driver.findElement(By.id("pass")).isEnabled();
		Assert.assertEquals(true, b);
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test2()
	{
		driver.findElement(By.id("email")).sendKeys("Kishore");
		boolean a = driver.findElement(By.id("pass")).isDisplayed();
		Assert.assertEquals(true, a);
		boolean b = driver.findElement(By.id("pass")).isEnabled();
		Assert.assertEquals(true, b);
		System.out.println(driver.getCurrentUrl());
	}
}
