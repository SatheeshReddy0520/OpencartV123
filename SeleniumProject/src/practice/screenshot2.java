package practice;


import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class screenshot2 {

	public static void main(String[] args) throws Exception {
		
		RemoteWebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
     	File original =driver.getScreenshotAs(OutputType.FILE);	
	    File last=new File("C:\\Users\\DTLPHY20\\Pictures\\Screenshots//img1.png");	
	    Files.copy(original, last);
	    System.out.println(" Screenshot Saved ");
	
	
	
	
	
	
	
	
	}

}
