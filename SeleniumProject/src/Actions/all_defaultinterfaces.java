package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class all_defaultinterfaces {
	
	public static void main (String[] args) throws Exception {

        WebDriver driver=null;
        
		Actions act=new Actions(driver);
		
		act.moveToElement(null);
		act.doubleClick();
		act.contextClick();
		act.click();
		
		
		
		Select sc=new Select(null);
		sc.selectByValue(null);
		sc.selectByIndex(0);
		sc.selectByVisibleText(null);
	
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("console type text");
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		
		wait.until(ExpectedConditions.invisibilityOf((WebElement) By.xpath("")));
		wait.until(ExpectedConditions.visibilityOfAllElements((List<WebElement>) By.linkText("")));
		
		RemoteWebDriver driver1;
		
		File org=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File last =new File("location to store the screenshot");
		
		Files.copy(org, last);
		
		
		driver.switchTo().alert().accept();		
		
		Alert myalert=driver.switchTo().alert();//it will sue only promt alert
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
	
		
	}

}
