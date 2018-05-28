package BasicTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.findElementByXPath("//input[@id='search']").sendKeys("lahore di aa");
			driver.findElementByXPath("//button[@class='style-scope ytd-searchbox']").click();
			//button[@id='search-icon-legacy']
		//driver.findElementByXPath("//button[@id='search-icon-legacy']").click();
			
	    //driver.findElementByXPath("//img[@src=https://i.ytimg.com/vi/dZ0fwJojhrs/hqdefault.jpg?sqp=-oaymwEXCPYBEIoBSFryq4qpAwkIARUAAIhCGAE=&rs=AOn4CLCmKiuMeS0opnb3s9ZMlbFhyiGcVA]").click();
		
		
		driver.findElementByXPath("//img[@width='246'  and @style='background-color: transparent;']").click();
		
		
		
		
	}

}
