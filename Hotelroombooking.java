package adatin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotelroombooking {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium4.5\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("kabilanviveka");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("kabilan@123");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		WebElement location = driver.findElement(By.id("location"));
		Select drive = new Select(location);
		drive.selectByIndex(1);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select hotel1 = new Select(hotel);
		hotel1.selectByIndex(2);
		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select drive2 = new Select(roomtype);
		drive2.selectByValue("Double");
		WebElement findElement2 = driver.findElement(By.id("room_nos"));
		Select s2 = new Select(findElement2);
		s2.selectByValue("2");
		WebElement date = driver.findElement(By.name("datepick_in"));
		date.clear();
		date.sendKeys("11/09/2012");
		WebElement date2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		date2.clear();
		date2.sendKeys("13/09/2012");
		WebElement date3 = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(date3);
		s4.selectByValue("3");
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(2);
		WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']"));
		Submit.click();
		WebElement confirm = driver.findElement(By.xpath("//input[@type='radio']"));
		confirm.click();
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		firstname.sendKeys("kabilan");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("R");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Saveriyar palayam , Karumpullikad, Mettur(t.k),Salem(D.t)");
		WebElement carsd = driver.findElement(By.id("cc_num"));
		carsd.sendKeys("1123456789123112");
		WebElement cc = driver.findElement(By.id("cc_type"));
		Select S9 = new Select(cc);
		S9.selectByIndex(1);
		WebElement exp = driver.findElement(By.id("cc_exp_month"));
		Select s10 = new Select(exp);
		s10.selectByValue("2");
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.id("cc_exp_year"));
		Select s11 = new Select(findElement);
		s11.selectByValue("2022");
		
		  WebElement cc1 = driver.findElement(By.id("cc_cvv")); cc1.sendKeys("1235");
		 WebElement kab = driver.findElement(By.id("book_now")); kab.click();
		 Thread.sleep(5000);
		 WebElement my = driver.findElement(By.id("my_itinerary")); my.click();
		 WebElement cliick = driver.findElement(By.name("ids[]"));
		 cliick.click();
		 Thread.sleep(5000);
		 WebElement cliick2 = driver.findElement(By.id("check_all"));
		  cliick2.click();
		  
		  driver.switchTo().alert().accept();
		  WebElement findElement3 = driver.findElement(By.id("logout"));
		  findElement3.click();
		 

	}

}
