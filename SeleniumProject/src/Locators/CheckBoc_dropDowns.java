package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoc_dropDowns {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
		driver.findElement(By.id("g2599-name")).sendKeys("satheesh");
		driver.findElement(By.name("g2599-email")).sendKeys("satheesh123@gmail.com");
		driver.findElement(By.name("g2599-website")).sendKeys("https://ultimateqa.com/simple-html-elements-for-automation/");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
		
		Select dropdown1=new  Select(dropdown);
		dropdown1.selectByIndex(3);
		Thread.sleep(3000);
		dropdown1.selectByValue("7-10");
		Thread.sleep(3000);
		dropdown1.selectByVisibleText("10+");  
		
	   	
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[5]/label[4]")).click();  
      
        driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/div[6]/label[3]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"contact-form-comment-g2599-comment\"]")).sendKeys("it is filled the form as required details");
		
		
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/p[3]/button")).click(); 
		
		
		
		
}
}