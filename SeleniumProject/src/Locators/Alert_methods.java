package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_methods {

	public static void main(String[] args) throws Exception {

		
		WebDriver driver=new ChromeDriver();
		
		//1-- simple Alert 
		
	driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
	//  driver.switchTo().alert().accept();
       Thread.sleep(3000);
	Alert myalert=driver.switchTo().alert();
      System.out.println(myalert.getText());
     myalert.accept();
		

// 2 confirmation aleret
driver.manage().window().maximize();
driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
/*driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
       Thread.sleep(3000);
     //  driver.switchTo().alert().accept();
      ]=] driver.switchTo().alert().dismiss();

       
       //3 promt alert 
       
       driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
 
   Alert  myalert =  driver.switchTo().alert();
      
   myalert.sendKeys("Welcome");
   
   myalert.accept();
  // myalert.dismiss();
   
   // driver.quit();
   
   */
   
             //4       //Authenticated Popup
   
   


	}

}
