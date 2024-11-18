package PracticaAll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownPcr {

	public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Frames.html");
        
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.flipkart.com/");
      
     Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.xpath(""));
        WebElement drop = driver.findElement(By.xpath(""));
        act.dragAndDrop(source, drop);
     
        
	}

}
