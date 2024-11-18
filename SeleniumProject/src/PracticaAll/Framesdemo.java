package PracticaAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesdemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	    WebElement frame1=	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Satheesh");
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Vijay");	
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		
	     driver.switchTo().frame(frame3);
	     driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Vamshi"); 
		   
		   
		WebElement iframe=driver.findElement(By.xpath("//div[@class='teQAzf']"));	
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"i19\"]/div[2]")).click();
		Thread.sleep(3000);
	WebElement dropdown =driver.findElement(By.xpath("//div[@jsname=\"LgbsSe\"]"));	
	         dropdown.click();
	         
	         driver.findElement(By.xpath("//*[text()='Well, now I know :-)']")).click();
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@jsname=\"YPqjbf\"]")).sendKeys("Welcome");
		driver.findElement(By.xpath("//div//textarea[@aria-label=\"Your answer\"]")).sendKeys("Welcome to the Java and Selenium");  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
			
		System.out.println("Code Passed");
          driver.quit();
	}

}
