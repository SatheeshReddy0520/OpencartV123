package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class script2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://omayo.blogspot.com/#");
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='drop1']"));
	Select sc=new Select(dropdown);
	Thread.sleep(2000);
	sc.selectByIndex(2);
	
	
	}


}


