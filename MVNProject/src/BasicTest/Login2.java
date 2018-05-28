package BasicTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://thetestingworld.com/testings/register.php");
			driver.findElementByXPath("//input[@name='fld_username']").sendKeys("ankitsrv");
            driver.findElementByXPath("//input[@name='fld_emaill' or @type='email']").sendKeys("ankit.ame91@gmail.com");
            driver.findElementByXPath("//input[@name='fld_password' and @type='password']").sendKeys("admin@123");
            driver.findElementByXPath("//*[@*='phone']").sendKeys("123456789");
            driver.findElementByXPath("//input[@name='address']").sendKeys("new delhi");
            driver.findElementByXPath("//div[@class='btn']/input[2]").click();
		
		
	}

}
