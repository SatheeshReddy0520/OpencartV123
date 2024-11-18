package practice;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class script1 {

	public static void main(String[] args) throws Exception {
		
		RemoteWebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		  
		        // Open a web page
		        driver.get("file:///path/to/your/local/html/file.html");

		        // Use CSS Selector to find elements
		        WebElement header = driver.findElement(By.cssSelector("#header"));
		        WebElement button = driver.findElement(By.cssSelector(".button"));
		        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
		        
		        // Print the text of the header element
		        System.out.println("Header text: " + header.getText());
		        
		        // Click the submit button
		        submitButton.click();
		        
		        // Close the browser
		        driver.quit();
		    }
			
}

