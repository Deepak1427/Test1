package test_Selenium_Package;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class keyboardActions {
	public WebDriver driver;
  @Test
  public void KB() {
	  
	  driver.navigate().to("https://www.bing.com");
	  Actions buildaction = new Actions(driver);
	  buildaction.sendKeys(Keys.NUMPAD7).perform();;
	  //buildaction.sendKeys(Keys.TAB).perform();
	  buildaction.sendKeys(Keys.ENTER).perform();
	  //buildaction.sendKeys("Flowers");
	  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  try {
		Files.copy(screenshot, new File("/Users/Shared/Deepak/Documents/deepu3.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
