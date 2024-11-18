package Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.flipkart.com/");                 // 1)Get method
		
		// driver.navigate().to("https://www.flipkart.com/");         // 2)navigate.to Method;

		 
	  String std= driver.getTitle();	     // 3) getTitle Method 
	  System.out.println(std);

	 if (std.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		
	 {
		System.out.print("it is true");
	 }
	 else 
	 {
		 System.out.print("it is False"); 
	 }
	
	 // String s=driver.getCurrentUrl();                          //4)grtCurrenturl Method 	
		
	//driver.manage().window().minimize();                         //5) maminize and maximize Method 
	//driver.manage().window().maximize();
		
	// driver.navigate().forward();
	// driver.navigate().back();                                    //6)Forward and Backward Method 
		
		
		//driver.navigate().refresh();                             //7)Refresh Method 
	
		
		
		// driver.quit();                                         8)Quit and Close Method 
		// driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
