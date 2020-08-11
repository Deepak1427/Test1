package test_Selenium_Package;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParallelExecution {
	WebDriver driver;
	RemoteWebDriver rdriver = null;
  @Test
  @Parameters("browser")    
  public void beforeTest(String browser) throws MalformedURLException {
	  if (browser.equalsIgnoreCase("chrome")) {
	    	//System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
			//driver = new ChromeDriver();
		DesiredCapabilities capability = new DesiredCapabilities().chrome();	
		  rdriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability.chrome());
			//DesiredCapabilities capability = new DesiredCapabilities().chrome();
			//DesiredCapabilities.chrome();
			rdriver.get("http://automationpractice.com/index.php");
			rdriver.manage().window().fullscreen();
			

	        //driver.get("http://automationpractice.com/index.php");
	  		rdriver.quit();
	  }}
@Test
public void login() throws InterruptedException {

    rdriver.findElement(By.xpath(".//a[@class='login']")).click();

    // rdriver.findElement(By.xpath(".//a[@class='login']")).click();

    rdriver.findElement(By.id("email")).sendKeys("test4uqa@yopmail.com");

    // rdriver.findElement(By.id("email")).sendKeys("test4uqa@yopmail.com");

    rdriver.findElement(By.id("passwd")).sendKeys("Test@123");

    // rdriver.findElement(By.id("passwd")).sendKeys("Test@123");

    rdriver.findElement(By.id("SubmitLogin")).click();

    // rdriver.findElement(By.id("SubmitLogin")).click();

}


    // rdriver.quit();

}


	        
	       /* if (browser.equalsIgnoreCase("Firefox")) {
	        	//System.setProperty("webdriver.gecko.driver","/Users/deepaka/Downloads/geckodriver");
	        	
	    		//driver = new FirefoxDriver();
	    		rdriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
				DesiredCapabilities capability = new DesiredCapabilities().firefox();
				DesiredCapabilities.firefox();
				rdriver.get("http://automationpractice.com/index.php");

	            //driver.get("http://automationpractice.com/index.php");
	            driver.quit();
	        }}
  }*/

