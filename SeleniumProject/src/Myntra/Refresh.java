package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();

		 driver.get("https://web.whatsapp.com/");
		 
		 driver.navigate().refresh();
	}

}
