package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//driver.get("https://testingcolleges.blogspot.com/2023/08/demo-form.html");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Electronics")).click();
		//driver.findElement(By.partialLinkText("Digital downl")).click();
/*	    driver.findElement(By.id("fname")).sendKeys("sunny");
		driver.findElement(By.id("lname")).sendKeys("leone");
	    driver.findElement(By.className("_1427")).sendKeys("satheesh123@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"fem\"]")).click();
	    driver.findElement(By.name("num")).sendKeys("9866864224");
	    driver.findElement(By.name("Birth")).sendKeys("05/07/2000");
	    driver.findElement(By.xpath("//*[@id=\"shby\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"fruits\"]/option[4]")).click();
	    driver.findElement(By.id("submit")).click();  */
		
		
		
		//Contains and Starts-with 
		
		
		
		
	//	driver.findElement(By.xpath("//input[contains(@ placeholder,'Search store')]")).sendKeys("electromics");
     //	driver.findElement(By.xpath("//input[starts-with(@ placeholder,'Search ')]")).sendKeys("electromics");
     	
     	
     	//Chained Xpath 
     	
       boolean status=driver.findElement(By.xpath("//div[@class='header-logo']/a/img")).isDisplayed();
     	
     	System.out.println(status);
     	
     	
     	
     	 
     	
     	
     	
     	
     	
     	
     	
     	

	    
	    
	}

}
