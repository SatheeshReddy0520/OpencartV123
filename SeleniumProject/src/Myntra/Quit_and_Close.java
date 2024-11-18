package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit_and_Close {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		 driver.get("https://web.whatsapp.com/");
		 driver.quit();
		 driver.close();
	}

}
