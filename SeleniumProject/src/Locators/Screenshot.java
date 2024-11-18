package Locators;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws Exception  {
		
		RemoteWebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		File original= driver.getScreenshotAs(OutputType.FILE);
		 File last= new File ("C:\\Users\\DTLPHY20\\April\\SeleniumProject\\src\\Screenshot/img1.png");
		
		 Files.copy(original, last);
		 
		 System.out.println("Screenshot was saved Succesfully");
		

	}

}
