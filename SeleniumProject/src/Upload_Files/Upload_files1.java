package Upload_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_files1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\DTLPHY20\\Documents//programCode.txt");
		
if(	driver.findElement(By.xpath("//ul[@id='fileList']")).getText().equals("programCode.txt"))
{
	System.out.println("File has been uploaded sucessfully");		
}
else
{
	System.out.println("File has failed to upload");	
}		
		
  Thread.sleep(3000);
   driver.quit();							
	}

}
