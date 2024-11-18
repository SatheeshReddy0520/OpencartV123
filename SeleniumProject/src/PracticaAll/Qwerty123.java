package PracticaAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qwerty123 {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("satheesh");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Bojjireddy");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("satheeshreddy@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("satheeshreddy@gmail.com");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("satheesh123");
		
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
	}

}
