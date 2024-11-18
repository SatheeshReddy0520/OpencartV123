package xpathaxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtypes_Methods {

	public static void main(String[] args) throws Exception {

		WebDriver driver =new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.findElement(By.xpath("//input[contains(@placeholder,'user')]")).sendKeys("Admin");
	//    driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='username']")).sendKeys("Admin");  
	    
    	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Username')]")).sendKeys("Admin");
    	
    	driver.findElement(By.xpath("//input[ends-with(@placeholder,'Password')]")).sendKeys("admin123",Keys.ENTER);
    	
        driver.findElement(By.xpath("//input[@type='pasword' or @name='password']")).sendKeys("admin123",Keys.ENTER);
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='Admin']")).click();
		
	}

}
