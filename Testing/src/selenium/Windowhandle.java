package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Windowhandle {

	public static void main(String[] args) {
		WebElement webelement = driver.findElement(By.xpath("*Xpath Locator*"));
		 
		Actions actions = new Actions(driver);
		Actions action = actions.contextClick(webelement).build();
		action.perform();
		<h2>Double Click</h2>
		Actions action = new Actions(driver);
		action.doubleClick(myElemment);
		action.perform();
		
		}
		
		}


		
		
	

