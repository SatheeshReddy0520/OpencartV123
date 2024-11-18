package PracticaAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPrc {

	public static void main(String[] args) throws Exception {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        
        Thread.sleep(2000);
        Actions act =new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).perform();
        act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Alerts']"))).click().perform();         
         
        act.contextClick(driver.findElement(By.xpath("//*[text()='Alert with OK ']"))).perform();
        
        act.doubleClick(driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"))).perform();
          
        System.out.println("Code Passed");
        driver.quit();
        
 
	
	
	
	
	
	}

}
