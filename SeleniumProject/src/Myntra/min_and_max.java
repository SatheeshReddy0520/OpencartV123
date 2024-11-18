package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class min_and_max {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://web.whatsapp.com//");
		
	    driver.manage().window().maximize();
		driver.manage().window().minimize();
		
	}

}
