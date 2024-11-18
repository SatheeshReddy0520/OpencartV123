package Javascript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://formy-project.herokuapp.com/form");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//By ID
	js.executeScript("document.getElementById('first-name').value='satheesh';");
		

	//By Name same like id syntax just change the id as a Name 
	
  	js.executeScript("document.getElementByName('first-name').value='satheesh';"); // its not a valid syntax
	
	
    	//ByClass Name 
  	
    	Thread.sleep(3000);
     js.executeScript("document.getElementsByClassName('form-control')[1].value='kumar';");
	
    //By TagName
     
     Thread.sleep(3000);
     js.executeScript("document.getElementsByTagName('input')[2].value='Tester';");
 
   //By Css Selector 
     Thread.sleep(3000);
     js.executeScript("document.querySelector('#job-title').value='QA Tester';");
     
     //By xpath
     Thread.sleep(3000);
     driver.navigate().refresh();
     
     js.executeScript("document.evaluate(\"//input[@id='first-name']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='Vijay';");
     
	Thread.sleep(10000);
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	

	}

}
