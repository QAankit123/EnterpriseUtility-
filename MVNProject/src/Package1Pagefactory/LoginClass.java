package Package1Pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Package3.PreClass;

public class LoginClass  {
    
	@FindBy(id="email") WebElement usrName_textbox;
	
	@FindBy(name="pass")WebElement PassWord_textbox;
	
	@FindBy(xpath="//input[@type='submit']")WebElement Submit_Btn;
	
	
    public void EnterUserName(String uname) {

    	usrName_textbox.sendKeys(uname);		
	}
	
	public void EnterPassWord(String pass) {
		   
		PassWord_textbox.sendKeys(pass);
		
	}
	
	 public void ClickOnLogin() {
		
		  Submit_Btn.click();
		 
	}
	}
	
	
	

