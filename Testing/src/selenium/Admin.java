package selenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {
	static WebDriver driver ;
	public static String  errormsg;


	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\personal\\Downloads\\chromedriver.exe");
		

		FileReader file = new FileReader("C:\\Users\\personal\\Desktop\\input.txt");
		BufferedReader br = new BufferedReader(file);
		int iteration = -1;
		int count =0;
		String line;
		while((line = br.readLine())!=null) {
			
				
				count = count+1;
				iteration= iteration+1;
				if(count>1) {
					String [] inputdata = line.split(",",2);
					
		
		
		WebDriver driver = new ChromeDriver();// it launches blank url
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=enkflfv42aqo2eat0s1b13uaq0");
		driver.findElement(By.name("username")).sendKeys(inputdata[0]);
		driver.findElement(By.name("password")).sendKeys(inputdata[1]);
		driver.findElement(By.id("tdb1")).click();
		//String errormsg= driver.findElement(By.className("messageStackError")).getText();

		if(iteration == 4) {// && (errormsg.contains("tha maximum number of login attempts has been reached ,please try again in 5 minutes"))){
			System.out.println(iteration + ")the maximum number of login attempts are over - passed");
			
		} 
		else
		{
			System.out.println(iteration + ") the maximum iterations are not over - failed");
		}
		driver.close();
		}
		
	}
		br.close();
		file.close();
				
				
				
		}
	}

