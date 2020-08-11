package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*public class Normal {
	WebDriver driver;
	
	public Normal( WebDriver driver ) {
		this.driver = driver;
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement SearchTextbox;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	private WebElement SearchButton;
	
	
	public void Amazonsearchmethods() {
		
		SearchTextbox.sendKeys("Earphones");
		SearchButton.click();
		
	}
	
	@FindBy(xpath="//*[@id=\"pdagDesktopSparkle\"]/div/div[1]/div[1]/a/div/div/img")
	private WebElement PDPclick;
	
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]")
	private WebElement addtocart;
	
	public void PDP() {
		PDPclick.click();
		addtocart.click();
	}

*/

public static void main(String[] args)	
{
	String x = "YUVARAJ DEEPAK";
	
	char y[] = x.toCharArray();
	int size = y.length;
	char a[] = new char[size];
	
	int i=0;
	while(i!=size)
	{
		a[size-1-i] = y[i];
		++i;
	}
	System.out.println(y);
	System.out.println(a);
}}
