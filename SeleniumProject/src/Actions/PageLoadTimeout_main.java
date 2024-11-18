package Actions;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout_main {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		Instant starttime=Instant.now();
		
		System.out.println("Starting Time:"+starttime);
		driver.get("https://demo.automationtesting.in/Register.html");
	
		Instant endtime=Instant.now();
		
		System.out.println("End Time:"+endtime);
		Duration time=Duration.between(starttime, endtime);
		System.out.println("Pageloadtime "+time.toSeconds());
		driver.quit();
		
		
		
		

	}

}
