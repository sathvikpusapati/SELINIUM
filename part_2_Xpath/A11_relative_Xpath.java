package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11_relative_Xpath {
	
	public static void main(String []ak)throws Exception
	{
		//we use "//" to traverse from parent to any child
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files-20240910T090302Z-001/Html%20files/sampleHtmlcode1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
