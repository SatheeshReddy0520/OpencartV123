package PracticaAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/#");
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("satheesh@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pswrd\"]")).sendKeys("satheesh123");
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
	}

}
