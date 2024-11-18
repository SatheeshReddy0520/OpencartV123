package Locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplehandling {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	   Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobiles",Keys.ENTER);

		driver.findElement(By.xpath("//div[normalize-space()='Motorola G34 5G (Ocean Green, 128 GB)']")).click();
		
		String first=driver.getWindowHandle();
		
		System.out.println("First Tab = "+first);
		Set <String> second=driver.getWindowHandles();
		System.out.println("First and Second " + second);
		
		for(String secondtab : second)
		{
			if(!secondtab.equalsIgnoreCase(first)) {
				
				driver.switchTo().window(secondtab);
				
				driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[normalize-space()='Place Order']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9876543210");
		
			}
				
		}
		
		
	}

}
