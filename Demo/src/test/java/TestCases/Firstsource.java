package TestCases;

import org.testng.annotations.Test;

import POM.Normal;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class Firstsource {
	
	WebDriver driver;
	Normal homepage;
	
  @Test
  public void AmazonSearch()
  {
	 homepage.Amazonsearchmethods();
	 homepage.PDP();

  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().fullscreen();
	  homepage = PageFactory.initElements(driver, Normal.class);
	  
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	 //driver.quit(); d
  }

}
