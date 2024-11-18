package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_handling1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("electronics",Keys.ENTER);
	
		String mainwindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[2]/div/a[2]")).click();
		
	    	Set <String> second = driver.getWindowHandles();
	        	for (String handle : second )
			if (!handle.equalsIgnoreCase(mainwindow))
			{
				driver.switchTo().window(handle);
			break;	
			}
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Buy Now']")).click();
		
		System.out.println("Code was passed Sucessfully");
		
	
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://omayo.blogspot.com/#");
		
          	Thread.sleep(10000);
			driver.quit();
		
		
		
		
		
		

	}

}
