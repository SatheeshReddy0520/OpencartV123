package Locators;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
         List<WebElement> element=driver.findElements(By.xpath("//table//input[@type='checkbox']"));

        for(WebElement ele:element)
         {
         ele.click();
         }
         
      
      for (int i=0;i<element.size();i++)
         {
      	element.get(i).click();
        	 
         }
         
         
        
         
         
         Thread.sleep(10000);
         driver.quit();
         
         
         
         
         
         
         
         
         
	}

}
