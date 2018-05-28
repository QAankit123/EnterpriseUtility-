package P3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	ChromeDriver driver;
	public LoginPage(ChromeDriver driver){
		this.driver=driver;
	}
	
	
	public void EnterUserName(String uname) {
	
		driver.findElementById("email").sendKeys(uname);
	
	}
	
	public void EnterPassWord(String Pas) {
	
		driver.findElementById("pass").sendKeys(Pas);
		
	}
	
	public void ClickOnSignIn() {
	
		driver.findElementByXPath("//input[@type='submit']").click();
		
	}
	
	
	
}
