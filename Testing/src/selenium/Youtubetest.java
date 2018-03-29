package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtubetest {

	public static void main(String[] args) throws FindFailed {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in/");
		// for pause 
		 Screen s =  new Screen();
		 Pattern Googleimg = new Pattern("Googlesearch.png");
		s.wait(Googleimg,2000);
		s.click();
		//s.click();
		/*// for play 
		 Screen s =  new Screen();
		 Pattern Playimg = new Pattern("Playimg.PNG");
		s.wait(Playimg,2000);
		s.click();
		s.click();*/
	}

}
