package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("admin1");
		//driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("Register")).click();
		Alert popup= driver.switchTo().alert();
		
		String error = popup.getText();
		popup.accept();
		
		System.out.println(error);
		

	}

}
