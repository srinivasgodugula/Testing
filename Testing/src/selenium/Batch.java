package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Batch {
	static WebDriver driver ;
	//launch browser
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
	}
	// close browser
	public void CloseBrowser() {
		driver.close();
	}
	// Admin login
	public void AdminLogin(String username,String password)
	{
		
		driver.get("http://www.gcrit.com/build3/admin/");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}

	public static void main(String[] args) {
		
		Batch abc = new Batch();
		abc.launchBrowser();
		// testcase 1 : verify admin login (positive testcase)
		abc.AdminLogin("admin", "admin@123");
		String url = driver.getCurrentUrl();
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("login succssfully- passesd");
			
		}
		else {
			System.out.println("login is not succssfully- failed");
		}
		abc.CloseBrowser();
		// testcase 2: verify admin login (negative testcase)
		abc.launchBrowser();
		abc.AdminLogin("admin1", "admin@123");
			String errormsg = driver.findElement(By.className("messageStackError")).getText();
			if(errormsg.contains("error:invalid administrator login attempt:")) {
				System.out.println("testcase2:admin log in unsuccessful but showing correct error message");
			}
			else {
				System.out.println("testcase2:admin login is unsuccessful and showing incorrect error message");
			}
			abc.CloseBrowser();
			// testcase 3: verify redirect functionality from admin  interface to user interface
			abc.AdminLogin("admin","admin@123");
			driver.findElement(By.linkText("Online Catalog")).click();
			String url2= driver.getCurrentUrl();
			if(url2.equals("http://www.gcrit.com/build3/")) {
				System.out.println("testcase3: redirected from admin interface to user interface is successful - passed");
			}else
			{
				System.out.println("testcase3: redirected from admin interface to user interface is unsuccssful - failed");;
				
				
			}
			abc.CloseBrowser();
	}

}
