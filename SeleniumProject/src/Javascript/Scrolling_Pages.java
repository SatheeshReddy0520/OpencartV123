package Javascript;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Pages {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/#");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//To		
		js.executeScript("window.scrollTo(0,1000);");
		
		//By		
		js.executeScript("window.scrollBy(0,1000);");	
		Thread.sleep(5000);
		
		//By View 
		//Example 1-----
	  WebElement ele=driver.findElement(By.xpath("//input[@name='userid']"));	
      js.executeScript("arguments[0].scrollIntoView();",ele);
      ele.sendKeys("vijay");
      Thread.sleep(3000);
      
    //Example 2 ------
      WebElement ele2=driver.findElement(By.linkText("Blogger"));
      js.executeScript("arguments[0].scrollIntoView();",ele2);
      ele2.click(); 
      
      Thread.sleep(5000);
      
	// Zoom The page by using Javascriptexecutor
		
    	js.executeScript("document.body.style.zoom='120%';");
      
      System.out.println("The code Executed Sucessfully");
      
      Thread.sleep(10000);
      driver.quit();
      
		

	}

}
