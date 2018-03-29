package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
			WebDriver driver = new ChromeDriver();// it launches blank url
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in");
			driver.findElement(By.linkText("Gmail")).click();// using link element locator
			 
			driver.findElement(By.id("identifierId")).sendKeys("vasuhr123@gmail.com");// syntax1 its navigate to gmail login page and put vasuhr123@gmail.com
			//driver.findElement(By.className("gb_P")).click(); // using class inspector
			//driver.findElement(By.tagName("input")).sendKeys("vasuhr123@gmail.com");
			/*WebElement Email=driver.findElement(By.id("identifierId"));// syntax 2 to login page and find page
			Email.sendKeys("seleniumtestimg@123");
			Thread.sleep(3000);
			Email.clear();
			Email.sendKeys("srinivasgodugula@gmail.com");// removing seleniumtesting@123 and replace with srinivasgodugula2gmail.com
			
		
			driver.findElement(By.tagName("input")).sendKeys("vasuhr123@gmail.com");// using input tag element
			
			driver.findElement(By.linkText("gmail")).click();// using link element locator
	 
			
			driver.get("http://www.google.co.in");
			driver.findElement(By.partialLinkText("gma")).click();// using partial link text
		//	driver.findElement(By.id("identifierId")).sendKeys("vasuhr123@gmail.com");
			*/

	}

}
