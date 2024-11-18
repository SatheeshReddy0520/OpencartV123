package PracticaAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeAll {

	public static void main(String[] args) throws Exception {
	
	    WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	    driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
	    driver.findElement(By.xpath("//a[text()='Register Now!']")).click();
	    Thread.sleep(5000);   
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("012345"); 
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pranavi@123");
	    driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("pranavi@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("Pranavi");
	    driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys("Reddy");
	    driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("pranavi@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys("9099999944");
	    driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys("Kadiri,ananthapuram");
	    driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys("Vempalli,Kadapa");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys("Kadapa");
	    driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("Andhra");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("12345");
	    driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='newAccount']")).click();	    
	    driver.navigate().back();
	    driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("012345");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pranavi@123");
	    driver.findElement(By.xpath("//input[@name='signon']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();
	    driver.findElement(By.xpath("//a[text()='FI-SW-01']")).click();
	    driver.findElement(By.xpath("//a[text()='Add to Cart'][1]")).click();
	    
	    
	
	    
	    

	}

}
