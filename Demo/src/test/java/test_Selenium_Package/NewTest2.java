package test_Selenium_Package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;


public class NewTest2 {
	public WebDriver driver;
  @Test
  public void alert() throws InterruptedException{
	  	  		  
	  driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.0_6");
	  WebElement button = driver.findElement(By.xpath(".//*[.='Show a prompt alert']"));
	  button.click();
	  Thread.sleep(3000);
	  driver.switchTo().activeElement();
	  WebElement emailAddress = driver.findElement(By.xpath(".//input[@placeholder='Your Email address']"));
	  emailAddress.sendKeys("Test");
	  WebElement Submitbutton = driver.findElement(By.className("confirm"));
	  Submitbutton.click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("arguments[0].setAttribute('style',arguments[1]);", Submitbutton, "border: 3px solid red");
      Thread.sleep(1000);
  }

@BeforeMethod
public void beforeMethod()  {
	//System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
	driver = new SafariDriver();
}
}

