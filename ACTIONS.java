package adatin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ACTIONS {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium4.5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		Actions mouse = new Actions(driver);
		mouse.click().build().perform();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//a[text()='COURSES']"));
		mouse.click(findElement).build().perform();
		mouse.click(driver.findElement(By.xpath("//a[text()='COURSES']"))).build().perform();
		mouse.contextClick().build().perform();
		Thread.sleep(5000);
		mouse.contextClick(driver.findElement(By.xpath("//img[@src='courses-img/java.png']"))).build().perform();
		Thread.sleep(5000);
		mouse.doubleClick().build().perform();

	}

}
