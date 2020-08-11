package SampleProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PO {
	
	protected static WebDriver driver;

	PO(WebDriver driver){
		PO.driver= driver;
		PageFactory.initElements(driver, this);
	}




	@FindBy(name="q")
	public WebElement textbox;
	
	@FindBy(name="btnK")
	public WebElement button;


	
	
	
}
