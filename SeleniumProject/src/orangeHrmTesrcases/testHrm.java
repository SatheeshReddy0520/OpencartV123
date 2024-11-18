package orangeHrmTesrcases;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class testHrm {

	public static void main(String[] args) throws Exception {
	
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("");
		File original=driver.getScreenshotAs(OutputType.FILE);
		
		File last= new File ("location where to store ");
		Files.copy(original, last);
	}

}
