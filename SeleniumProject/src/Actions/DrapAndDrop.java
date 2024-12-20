package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrapAndDrop {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		

		   Actions Act=new Actions(driver);
	WebElement drag=	driver.findElement(By.xpath("//img[@src=\"images/high_tatras_min.jpg\"]"));
	WebElement drop=driver.findElement(By.xpath("//div//span[@class=\"ui-icon ui-icon-trash\"]"));
	
	    Act.dragAndDrop(drag, drop).perform();
	    
    	System.out.println("Code sucessfully executed");
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
