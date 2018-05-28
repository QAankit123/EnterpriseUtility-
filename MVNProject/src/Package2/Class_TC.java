package Package2;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Package1Pagefactory.LoginClass;
import Package3.PreClass;

public class Class_TC extends PreClass{

	@Test
	public void TestCase1(){
		
	LoginClass login = 	PageFactory.initElements(driver,LoginClass.class);
	login.EnterUserName("8827006735");
	login.EnterPassWord("ankit1991");
	login.ClickOnLogin();
		
		
			
	}
	
	
}
