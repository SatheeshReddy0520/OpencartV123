package Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();

		 driver.get("https://web.whatsapp.com/");
          
		String title= driver.getTitle();
		System.out.println(title);
		
		if(title.equals("WhatsApp Web"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
