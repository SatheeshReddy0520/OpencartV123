package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateto {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
      
		driver.navigate().to("https://www.myntra.com/");

	}

}
