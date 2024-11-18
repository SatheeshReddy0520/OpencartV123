package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://shop.bombas.com/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Women ']"))).perform();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='New Releases']"))).click().perform();
		System.out.println("Code Executed Sucessfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
