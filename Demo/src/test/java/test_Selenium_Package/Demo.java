package test_Selenium_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

/*public class Demo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/deepaka/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.youtube.com/");
		 * driver.findElement(By.xpath("(.//a[@id='video-title'])[1]")).click();
		 * 
		 * WebElement song1=
		 * driver.findElement(By.xpath("(.//a[@id='video-title'])[1]")); song1.click();
		 * // song1.click();
		 * 
		 * 
		 * 
		 * 
		 * /*String title = driver.getTitle(); driver.manage().window();
		 * System.out.println("Title of the window : " + title);
		 * 
		 * String urls = driver.getCurrentUrl(); System.out.println("urls" + urls);
		 * driver.close(); driver.quit();
		 
		// driver.navigate().to("http://newtours.demoaut.com/");
		// String urls1 = driver.getCurrentUrl();

		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(200);
		driver.manage().window().fullscreen();
		Thread.sleep(200);
		//driver.findElement(By.className("shop-phone")).getText();
		//System.out.println("Value:\t" + driver.findElement(By.className("shop-phone")).getText());
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		 WebElement element1 = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		 
		        Actions action = new Actions(driver);
		        action.moveToElement(element).build().perform();
		        Thread.sleep(300);
		        action.moveToElement(element1).click().build().perform();
		        driver.quit();
		 
		//action.moveToElement(element).moveToElement((WebElement) By.xpath("//a[@title='Women']")).click().build().perform();
		/*driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		
		
		Select dropdown = new Select (driver.findElement(By.className("shop-phone")));
	    dropdown.selectByIndex(4);
	    driver.quit();
	    
		
	}
}
// driver.quit();
/*
 * WebElement element = driver.findElement(By.name("country")); boolean status =
 * element.isDisplayed(); if(element.isDisplayed()) {
 * 
 * System.out.println("Pass"); } else { System.out.println("Fail"); } }
 **/




public class Demo {

    public WebDriver driver;
    
    RemoteWebDriver rdriver = null;

 
@Test
    public void b() {

    	/*System.setProperty("webdriver.chrome.driver","/Users/deepaka/Downloads/chromedriver");
		driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        
        if (browser.equalsIgnoreCase("Safari")) {
        	System.setProperty("webdriver.gecko.driver","/Users/deepaka/Downloads/geckodriver");*/
        	
    		driver = new SafariDriver();
            driver.get("http://www.automationpractice.com/");
            driver.manage().window().maximize();
            //driver.quit();
        }}

            
        //DesiredCapabilities capability = new DesiredCapabilities().chrome();
        //rdriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        //rdriver.get("http://automationpractice.com/index.php");

    

    /*public void login() throws InterruptedException {

        driver.findElement(By.xpath(".//a[@class='login']")).click();
        
        //rdriver.findElement(By.xpath(".//a[@class='login']")).click();

        driver.findElement(By.id("email")).sendKeys("test4uqa@yopmail.com");
        
        //rdriver.findElement(By.id("email")).sendKeys("test4uqa@yopmail.com");

        driver.findElement(By.id("passwd")).sendKeys("Test@123");
        
        //rdriver.findElement(By.id("passwd")).sendKeys("Test@123");

        driver.findElement(By.id("SubmitLogin")).click();
        
        //rdriver.findElement(By.id("SubmitLogin")).click();

    

       
        
        //rdriver.quit();*/

    


