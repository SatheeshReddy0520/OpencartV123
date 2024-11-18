package practice;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageload_and_multiplewindows {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Instant starttime=Instant.now();
		   System.out.println("Starting Time :" + starttime);
		   
		driver.get("https://formy-project.herokuapp.com/form");
		
		 Instant endtime=Instant.now();
		   System.out.println("End time :"+endtime );
		   
		   Duration time=Duration.between(starttime, endtime);
		   System.out.println("Pageload Time :"+time.toSeconds());
		   
		Thread.sleep(3000);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   driver.manage().window().maximize();
	   
	   Instant starttime2=Instant.now();
	     System.out.println("Starting Time :" + starttime2);
	   
	   driver.get("https://www.flipkart.com/");
	   
	   Instant endtime2=Instant.now();
	   System.out.println("End time :"+endtime2 );
	   
	   Duration time1=Duration.between(starttime2, endtime2);
	   System.out.println("Pageload Time :"+time1.toSeconds());
	   Thread.sleep(10000);
	   driver.quit();
	   
		

	}

}
