package test_Selenium_Package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Debug {
	WebDriver driver;
	int A = 10;
	int B = 20;
  @Test
  public void debug() 
  {
	  System.out.println("Hello World");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
	  driver = new ChromeDriver();  
	  driver.get("https://www.google.com/");
	  //driver.manage().window().maximize();
	  System.out.println("Success");
	  int C = A-B;
	  System.out.println("Total :"+C);
	  C = C+B;
	  System.out.println("Final Total : "+C);
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
