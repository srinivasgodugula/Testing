package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");// creating own xpath
		
		//driver.findElement(By.xpath("//input[contains(@type,'text']")).sendKeys("java");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Motors"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Motorcycles")).click();
		
	}

}
