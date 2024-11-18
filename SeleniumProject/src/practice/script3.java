package practice;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class script3 {

	public static void main(String[] args) throws Exception {
		
		RemoteWebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");		
		File Original=driver.getScreenshotAs(OutputType.FILE);
		File last=new File("C:\\Users\\DTLPHY20\\April\\SeleniumProject\\src\\Screenshot/img4.png");
		Files.copy(Original, last);
		System.out.println("Image saved sucessfully");
		
		
		
		
		

	}
}
