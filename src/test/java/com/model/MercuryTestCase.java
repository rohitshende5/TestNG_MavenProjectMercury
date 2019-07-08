package com.model;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MercuryTestCase {
	
	public WebDriver driver;
	
	
  @Test
  public void loginwithvalidds1()
  {
	  System.out.println("loginwithvalidds1 user Under Test ");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  System.out.println("user1 has login into loginwithvalidds1 ");
	  
	 boolean act_flag1= driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	 boolean exp_flag1=true;
	 AssertJUnit.assertEquals(act_flag1, exp_flag1);
	 System.out.println("Flight finder is display :"+act_flag1);
	 
	 driver.findElement(By.linkText("SIGN-OFF")).click();
	 
  }
  
  @Test
  public void loginwithvalidds2()
  {
	  System.out.println("loginwithvalidds2 user Under Test ");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap2");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword2");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  System.out.println("user1 has login into loginwithvalidds2 ");
	  
	 boolean act_flag2= driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	 boolean exp_flag2=true;
	 AssertJUnit.assertEquals(act_flag2, exp_flag2);
	 System.out.println("Flight finder is display :"+act_flag2);
	 
	 driver.findElement(By.linkText("SIGN-OFF")).click();
  }
  @Test 
  public void loginwithvalidds()
  {
	  
	  System.out.println("loginwithvalidds3 user Under Test ");
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap3");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword3");
	  driver.findElement(By.xpath("//input[@name='login']")).click();
	  System.out.println("user3 has login into loginwithvalidds3 ");
	  
	 boolean act_flag3= driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	 boolean exp_flag3=true;
	 AssertJUnit.assertEquals(act_flag3, exp_flag3);
	 System.out.println("Flight finder is display :"+act_flag3);
	 
	 driver.findElement(By.linkText("SIGN-OFF")).click();
	  
  }
  
  
  
  @BeforeMethod
  public void getAllcookies() 
  {
	  System.out.println("getAllcookies method under BeforeMethod");
	 Set<Cookie> cookies= driver.manage().getCookies();
	 for(Cookie cookie:cookies)
	 {
		 System.out.println(cookie.getName());
	 }
	 System.out.println("getCookies Successfuly");
  }

  @AfterMethod
  public void captureScreenShot() throws IOException
  {
	  System.out.println("captureScreenShot method under AfterMethod");
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFileToDirectory(src, new File("F:\\JAVA\\TESTING\\selinium\\MavenProjectMercury\\ScreenShot"));
	  System.out.println("Takes ScreenShot successfully");
	  
	  System.out.println("123");
	  
	  system.out.println("321");
  }

  @BeforeClass
  public void maximizeBrowser()
  {
	  System.out.println("MaximizeBrowser Under BeforeClass");
	  driver.manage().window().maximize();
	  System.out.println("maximize browser Successfully");
	  
	  System.out.println("123");
	    system.out.println("321");
  }

  @AfterClass
  public void deleteAllcookies()
  {
	  System.out.println("deleteAllcookies under AfterClass");
	  driver.manage().deleteAllCookies();
	  System.out.println("DeleteAllcookies Successfully");
	  
	  system.out.println("321");
	  
  }

  @BeforeTest
  public void enterApplicationURL()
  {
	  System.out.println("enterApplicationURL method under BeforeTest");
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	  System.out.println("Open url successfully");
	  
	  System.out.println("123");
	  
	  system.out.println("321");
  }

  @AfterTest
  public void dbConnectionCloesd()
  {
	  System.out.println("dbCoonectionClosed under AfterTest");
	  
	  System.out.println("123");
	  
	  system.out.println("321");
  }

  @BeforeSuite
  public void openBrowser()
  {
	  System.out.println("openBrowser Under BeforeSUite");
	  System.setProperty("webdriver.chrome.driver", "F:\\SELENIUM_TESTING\\chromedriver.exe");
	  driver=new ChromeDriver();
	  System.out.println("OpenBrowser Successfully");
	  
	  System.out.println("123");
	  
	  system.out.println("321");
  }

  @AfterSuite
  public void closedBrowser()
  {
	  System.out.println("cloesdbrowser under AfterSuite");
	  driver.close();
	  
	  System.out.println("123");
	  
	  system.out.println("321");
  }

}
