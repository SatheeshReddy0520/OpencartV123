package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
      driver.manage().window().maximize();
      driver.findElement(By.id("name")).sendKeys("satheesh reddy");
      driver.findElement(By.name("email")).sendKeys("satheeshreddy12345@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
	  driver.findElement(By.id("mobile")).sendKeys("1234567890");
	  driver.findElement(By.name("dob")).sendKeys("05/07/2000");
	 driver.findElement(By.name("subjects")).sendKeys("He is a wonderful person");
	 driver.findElement(By.xpath("//*[@id=\"hobbies\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[2]/input")).click();
	 driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[7]/div/div/div[2]/input")).click();
	 driver.findElement(By.xpath("//textarea[@placeholder=\"Currend Address\"]")).sendKeys("Delhi");
		
		
		
	WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"state\"]"));
	Select dropdown1 =new Select(dropdown);
	dropdown1.selectByIndex(2);
	
	WebElement dropdown2 =driver.findElement(By.xpath("//*[@id=\"city\"]"));
	Select dropdown3=new Select(dropdown2);
	dropdown3.selectByIndex(3);
	
	driver.findElement(By.xpath("//*[@//*[@value=\"Login\"]")).click();
	
		
		
		
		
		
	}

}
