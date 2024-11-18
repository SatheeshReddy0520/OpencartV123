package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice3 {

	public static void main(String[] args) throws Exception {           // DRopdwon 
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
           driver.manage().window().maximize();
        WebElement dropdown=   driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
        Select dropdown1=new Select(dropdown);
        Thread.sleep(3000);
       // dropdown1.selectByIndex(3);
        dropdown1.selectByValue("IND");
        Thread.sleep(5000);
       driver.navigate().refresh();
		Thread.sleep(3000);
       driver.navigate().back();
      Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(3000);
       
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
