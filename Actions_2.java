package adatin;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions_2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium4.5\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html?m=1");
		
		Actions as=new Actions(driver);
		as.clickAndHold(driver.findElement(By.name("G"))).build().perform();
		Thread.sleep(5000);
		as.release(driver.findElement(By.name("G"))).build().perform();
		as.click(driver.findElement(By.name("B"))).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
	 
		
		

	}

}
