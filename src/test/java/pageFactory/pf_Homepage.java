package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pf_Homepage {
	
	@FindBy(linkText = "Sign In")
	public WebElement lk_Signin;
	
	@FindBy(className = "proper")
	public WebElement lk_username;
	
//	Constructor
	public pf_Homepage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
//	click on Sigin
	public void click_Sigin(){
		lk_Signin.click();
	}
	
	
	public String extract_username(){
		return lk_username.getText();
	}
	
	

}
