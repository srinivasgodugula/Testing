package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();

		Pom login = new Pom(driver);
		login.Loginpage(driver);
		driver.get("http://www.gcrit.com/build3/admin/");
		login.Typeusername("admin");
		login.Typepassword("admin@123");
		login.ClickloginButton();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("http://www.gcrit.com/build3/admin/index.php")) {
			System.out.println("admin login is sucussfully - passed");
		}
		else
		{
			System.out.println("admin log in is unsuccessfully - failed");
			
		}
				
	}

}
