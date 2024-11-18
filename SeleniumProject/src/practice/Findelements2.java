package practice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements2 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	
     	List <WebElement> element=driver.findElements(By.xpath("//div//table[@id='productTable']"));
	
       //Foreach Loop
	//	for (WebElement ele: element) {
	//		System.out.println(ele.getText());
		
		//For Loop
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
		}
				
		Thread.sleep(10000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
