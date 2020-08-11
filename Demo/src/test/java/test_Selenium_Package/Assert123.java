package test_Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert123
{
    public WebDriver driver;
    
 @Test
 public void Ass()
 {
      System.out.println("Url is entered");
      String pagetitle = driver.getTitle();
      System.out.println("Title :" + pagetitle);
      Assert.assertSame ("pass", "pass" , "Message");
      
      
 }
 @BeforeMethod
 public void beforeMethod()
 {
     System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
     driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");

   
 }

 @AfterMethod
 public void afterMethod()
 {    
      driver.quit();
 }

}