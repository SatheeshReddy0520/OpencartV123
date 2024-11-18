package practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitydemo{

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
	
		// use Explict wait

		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(5));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		  element.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("user")));
	    driver.navigate().back();
	    driver.navigate().refresh();
	    driver.quit();
	    
	    
	 // another example
		 
     WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='timerButton']")));
	 element1.click();	 
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	  
	 //FluentWait syntax 
	 
	 
	 FluentWait <WebDriver> wait1= new FluentWait <WebDriver> (driver);
	 wait1.withTimeout(Duration.ofSeconds(10));
	
	 // 2 ways of clickable to this is 1
	 
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirm']"))).click();

         // this is 2nd Way 
	 
	WebElement element2=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='confirm']")));
	element2.click();
	 
	 driver.switchTo().alert().accept(); 
	
	

	}

}
