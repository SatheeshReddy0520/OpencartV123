package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/alertbox/");
		WebElement element=driver.findElement(By.xpath("//*[text()='Try it'][1]"));
		element.click();
		driver.switchTo().alert().accept();   //simple alert
		
		System.out.println(element.getText());
		
		//Confirmation alert
		
		WebElement element2=	driver.findElement(By.xpath("//*[text()='Try it'][2]"));
		element2.click();
		System.out.println(element2.getText());
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();  //either accept or dismiss
		
		//promt alert
		
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver=new FirefoxDriver();
		driver.get("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).click();
		driver.switchTo().frame(1);
		RemoteWebDriver src=new EdgeDriver();
		src.findElement(By.xpath(""));
		File original=src.getScreenshotAs(OutputType.FILE);
		
		
		File last =new File("storage location");
		Files.copy(original, last);
		
		
		
	     
		
	}

}
