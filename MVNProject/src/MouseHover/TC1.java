package MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

public class TC1 extends A {
       @Test
	   public void TestCase() {
		
       Actions act = new Actions(driver);
	
       //act.moveToElement((WebElement) By.xpath("//span[text()='TRAINING']"))).perform();
       act.moveToElement(driver.findElement(By.xpath("//span[text()='TRAINING']"))).perform();
       act.moveToElement(driver.findElement(By.xpath("//a[@title='ONLINE TRAINING']"))).perform();;
	
	
	
	
	
	
       }
}
