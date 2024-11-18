package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
           driver.get("https://www.myntra.com/");
           driver.manage().window().maximize();
           
         String title= driver.getCurrentUrl();
         System.out.println(title);
          driver.quit();

	}

}
