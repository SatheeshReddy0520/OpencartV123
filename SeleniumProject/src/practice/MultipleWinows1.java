package practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWinows1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();	
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
	    System.out.println("Title = "+title);
	     
		
		//By using with Multiple tab 
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/browser-windows");
		String url=driver.getCurrentUrl();
		System.out.println("URL="+url);
		
		
		
		//By using with Multiple window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String tle=driver.getTitle();
		System.out.println("Title=" +tle);
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("Admin")).click();
		
	driver.quit();
		
		
		
	
		
	}

}
