package Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
	/* List <WebElement> elements=driver.findElements(By.tagName("a"));
    elements.size();
    System.out.println("total no of links :"+elements.size()); */
		
		List <WebElement> elements=driver.findElements(By.tagName("img"));
	   
	    System.out.println("total no of images :"+elements.size());
		
		
		
		
		
	}
	   

}
