package PracticaAll;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class qwert123 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		try {
		    WebElement unlikeElement = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		    unlikeElement.click();
		    System.out.println("it is clicked");
		} catch (NoSuchElementException e) {
			System.out.println("not clicked");
		}

		try {
		    WebElement selectElement = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		    selectElement.click();
		    System.out.println("its select");
		} catch (NoSuchElementException e) {
			System.out.println("not select");
		}

		try {
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[@href=\"http://demo.guru99.com/payment-gateway/index.php\"]"), "Payment Gateway Project"));
		    System.out.println();
		} catch (Exception e) {
			System.out.println("invalid");
		}

		try {
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("xpath_of_element"), "expected_text"));
		    System.out.println();
		} catch (Exception e) {
			System.out.println();
		}
		}
	}


