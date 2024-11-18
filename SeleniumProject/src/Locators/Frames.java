package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
	   // Frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
	//	Frame 2 
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
	
		driver.switchTo().defaultContent();
		
		//Frame 4 
		
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("hello");
		driver.switchTo().defaultContent();
		
		// Frame 3
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		// inner iframe by selecting as a index 
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		
		driver.findElement(By.xpath("//div[@class='e2CuFe eU809d']")).click();
		// driver.findElement(By.xpath("//div[@role='option']//span[@class='vRMGwf oJeWuf'][normalize-space()='Well, now I know :-)']")).click();
		
		
		//driver.findElement(By.xpath("//div/span[@class='vRMGwf oJeWuf']")).click();
		driver.switchTo().defaultContent();
		
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name=\'mytext5\']")).sendKeys("Taj Mahal");
		
		driver.findElement(By.xpath("//a[@href=\"https://a9t9.com\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div[1]/div[1]/a")).click();
		
     	System.out.println("Code Passed");
		
	}

}
