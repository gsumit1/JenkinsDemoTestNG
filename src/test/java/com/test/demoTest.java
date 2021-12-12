package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoTest {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeClass() {
		System.out.println("This will execute before the Class");
		System.setProperty("webdriver.chrome.driver", "/Users/riyaanghosh/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test	
	public void testCase1() {
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//a[contains(.,'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("Sumit");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),' Thank you ')]")).isDisplayed());
		
	}

	@Test
	public void testCase2() {
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//a[contains(.,'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("Sumit");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),' Thank you ')]")).isDisplayed());

	}

	@Test
	public void testCase3() {
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//a[contains(.,'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("Sumit");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),' Thank you ')]")).isDisplayed());

	}

	
	@Test(groups = {"smoke"})
	public void smoke() {
		System.setProperty("webdriver.chrome.driver", "/Users/riyaanghosh/Downloads/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://demo.guru99.com/test/newtours/index.php");
		driver1.quit();
	}

	@AfterMethod
	public void afterClass() {
		driver.quit();
	}

}
