package PracticaAll;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class screensh {

	public static void main(String[] args) throws Exception {
		
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("Url");
		
		File original=driver.getScreenshotAs(OutputType.FILE);
		
		File last =new File("location where to store");
		
		Files.copy(original, last);
		
		
	}

}
