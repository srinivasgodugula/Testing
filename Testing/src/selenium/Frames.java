package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {


		

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
				WebDriver driver = new ChromeDriver();// it launches blank url
				driver.manage().window().maximize();
				driver.get("https://www.icicibank.com");
				String Browswrtitle = driver.getTitle();
				System.out.println(Browswrtitle);
				String Browserurl = driver.getCurrentUrl();
				System.out.println(Browserurl);
				driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
				driver.switchTo().frame(2);
				driver.findElement(By.linkText("org.openqa.selenium")).click();// its swich to paarticular link to same page
				
				driver.switchTo().defaultContent();// its redirects to top/main window again
				Thread.sleep(5000);
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("html/body/div[2]/ul/li[2]/a")).click();// its redirects to frame 1 in particular link


			}

		


	}


