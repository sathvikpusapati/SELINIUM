package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_By_Text {

	public static void main(String []ak)throws Exception
	{
		WebDriver driver = new ChromeDriver();
		//syntax :tagname[@Attribute name='Attribute values']
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files-20240910T090302Z-001/Html%20files/sampleHtmlcode1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='fname']")).sendKeys("subbu");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
