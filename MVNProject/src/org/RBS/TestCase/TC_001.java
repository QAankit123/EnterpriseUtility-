package org.RBS.TestCase;

import java.util.ResourceBundle;

import org.RBS.Base.BaseData;
import org.RBS.Page.LoginPageNew;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_001 extends BaseData {
	
	
	
	// **From line 12 to 23 code is form normal POM concept and we are taking data from Properties file then in below code we are using the Data Driven Concept.****///
//@Test
//	public void Case1() {
//		// TODO Auto-generated method stub
//
//	ResourceBundle rb1 = ResourceBundle.getBundle("Config");	
//	LoginPageNew LPN = new LoginPageNew(driver);
//	
//	LPN.EnterUserName(rb1.getString("User_name"));
//	LPN.EnterUserPassword(rb1.getString("User_password"));
//	LPN.ClickOnLogin();
//	
//	}
//________________________________________________________________________
///*** In below code we are Using concept of Data Driven Framework.****
//_______________________________________________________________________________
	
	
	
	@Test(dataProvider ="DP1")
	public void Case1(String a, String b) {
		
	Logger log = Logger.getLogger(TC_001.class)	 ;

	ResourceBundle rb1 = ResourceBundle.getBundle("Config");	
	LoginPageNew LPN = new LoginPageNew(driver);
	
	LPN.EnterUserName(a);
	LPN.EnterUserPassword(b);
	LPN.ClickOnLogin();
	
	}
	
	
	@DataProvider(name="DP1")
	public Object[][] TestData() {
		
		Object [][] arr = {
				       
				
				{"uname1","pass1"},
				{"uname2","pass2"},
				{"uname3","pass3"}
				
				
		};
      return arr;
	}




}
