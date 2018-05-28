package Assertions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=false;
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver ();
		 driver.get("https://www.facebook.com");
		 a =GetTitle("wewwew",driver);
		System.out.println(a);
	}
	
	public static boolean GetTitle(String ExpURL,ChromeDriver driver) {
		// TODO Auto-generated method stub
         boolean result= false;
         
         try {
			String a= driver.getCurrentUrl();
if(	 driver.getCurrentUrl().equalsIgnoreCase(ExpURL))
{
			result =true;
			
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     return result;
	}
	
}
