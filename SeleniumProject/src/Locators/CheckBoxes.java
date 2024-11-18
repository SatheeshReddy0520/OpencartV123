package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://formy-project.herokuapp.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
		
		
	List <WebElement> checkboxes =driver.findElements(By.xpath("//div[@class='input-group']"));
		
	
		for(int i = 0;i<checkboxes.size();i++)
	      checkboxes.get(i).click();		
		
		
		
	}

}
