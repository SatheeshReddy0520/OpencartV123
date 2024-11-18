package PracticaAll;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("watches",Keys.ENTER);             
		
		driver.findElement(By.xpath("//a[contains(text(),'Trending Premium Quality Day & Date Functioning fo')]")).click();		
		
		String first=driver.getWindowHandle();
		System.out.println("First Tab "+ first);
		Set <String> second=driver.getWindowHandles();
		System.out.println("First and Second " + second);
		
		for(String secondtab:second) {
			
			if(!secondtab.equalsIgnoreCase(first)) {
				driver.switchTo().window(secondtab);
	            
				Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='GO TO CART']")).click();
			
			
			Thread.sleep(3000);
		driver.quit();
			
			
		}
	
		
		
		
		
		
		}	
		
		}		
		
	}


