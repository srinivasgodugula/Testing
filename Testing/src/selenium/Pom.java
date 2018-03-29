package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom {
	 WebDriver driver ;
	
	
		By username = By.name("username");
		By pass = By.name("password");
		By LoginButton = By.id("tdb1");
		By ErrorMsg = By.className("messageStackError");
		
		
		public Pom(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}
		public void  Loginpage (WebDriver driver) {
			this.driver = driver; 
			
		}
		public void Typeusername(String uname) {
			driver.findElement(username).sendKeys(uname);
		}
		public void Clearusername() {
			driver.findElement(username).clear();
		}
		
		public String Captureusername() {
			 return driver.findElement(username).getAttribute("value");
		}
		public void Typepassword(String pword) {
			driver.findElement(pass).sendKeys(pword);
		}
		public void ClickloginButton() {
			driver.findElement(LoginButton).click();
		}
		public String Erromsg() {
		return driver.findElement(ErrorMsg).getText();
		}
	}


