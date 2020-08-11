package SampleProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Search {
	
	public static WebDriver driver;
	
	@BeforeTest
	public static void BrowserOpen() {
		
		System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
	}
	
	@Test(testName= "GoogleSearch" ,description= "Search")
	public static void page() throws InterruptedException  {
		
		driver.get("https://www.google.com");
		search(driver);
		
		
		
	}
	
	public static void search(WebDriver driver) throws InterruptedException  {
		
		PO obj = new PO(driver);
		System.out.println(obj);
		System.out.println("Driver:" +driver);
		
		obj.textbox.sendKeys("hello");
		Thread.sleep(2000);
		obj.button.click();
		
		
	}
	
	@AfterTest
	public static void BrowserClose() {
		
		driver.quit();
		
	}

}
