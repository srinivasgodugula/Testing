package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectcalenderbyjs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com/");
		WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateval = "25-06-2018";
		 
		selectcalenderbyjs( driver, date ,dateval);
		
	}

	public static void selectcalenderbyjs(WebDriver driver,WebElement element ,String dateval) {
		JavascriptExecutor js = ((JavascriptExecutor )driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
	}
}
