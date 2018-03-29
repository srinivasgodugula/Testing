package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserpopup {

	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
	WebDriver driver = new ChromeDriver();// it launches blank url
	driver.manage().window().maximize();
	driver.get("http://www.popuptest.com/goodpopups.html");
	driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
	Thread.sleep(3000);
	Set<String > handler =  driver.getWindowHandles();
	Iterator<String> it =  handler.iterator();
	String ParentWindowId = it.next();
	//System.out.println("parentwindow is"+ ParentWindowId);
	//String ChildWindowId = it.next();
	//System.out.println("parentwindow is"+ ChildWindowId);
//	driver.switchTo().window(ChildWindowId );
	Thread.sleep(3000);
	System.out.println("childwindow popup titls is"+driver.getTitle());
	driver.close();
	driver.switchTo().window(ParentWindowId );
	Thread.sleep(3000);
	System.out.println("Parentwindow popup titls is"+driver.getTitle());
}
}