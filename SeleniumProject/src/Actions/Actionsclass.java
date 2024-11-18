package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/pr?sid=clo%2Cash&otracker=categorytree&p%5B%5D=facets.ideal_for%255B%255D%3DMen&otracker=nmenu_sub_Men_0_Top%20wear");
    
		Actions action = new Actions(driver);
      
      // MoveToElement and click operations 
      
      action.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
      Thread.sleep(6000);
    action.moveToElement(driver.findElement(By.xpath("//*[text()='Apple']"))).click().perform();
      
    //ContextClick 
    
    Thread.sleep(5000);
   //   action.contextClick(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]"))).perform();
     
      
      action.doubleClick(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]"))).perform();
   
      
      
		
	}

}