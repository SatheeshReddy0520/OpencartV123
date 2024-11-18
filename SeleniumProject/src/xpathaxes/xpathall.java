package xpathaxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathall {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
	String self=	driver.findElement(By.xpath("//a[contains(text(),'Ashok Leyland')]")).getText();

	System.out.println("Self : "+ self);
	
	String parent=driver.findElement(By.xpath("//a[contains(text(),'Ashok Leyland')]/parent::*")).getText();
	
	System.out.println("Parent : "+parent);
	
	String ancestor=driver.findElement(By.xpath("//a[contains(text(),'Ashok Leyland')]/ancestor::tr")).getText();
	
	System.out.println("Ancestor : "+ancestor );
	
	String Desendant=driver.findElement(By.xpath("//a[contains(text(),'Ashok Leyland')]/ancestor::tr/descendant::td[4]")).getText();
	System.out.println("Desendant : "+ Desendant);
	
	List <WebElement> child=driver.findElements(By.xpath("//a[contains(text(),'Ashok Leyland')]/ancestor::tr/child::*"));
	System.out.println("No of Child : "+ child.size());
	
	List <WebElement> flosiblings=driver.findElements(By.xpath("//a[contains(text(),'Ashok Leyland')]/ancestor::tr/following-sibling::tr"));
	System.out.println("No of Following sibling : "+flosiblings.size() );
	
	List <WebElement> prciblings=driver.findElements(By.xpath("//a[contains(text(),'Ashok Leyland')]/ancestor::tr/preceding-sibling::tr"));
	System.out.println("No of Preceding siblings :" + prciblings.size());
	

	driver.quit();	
	
	}

}
