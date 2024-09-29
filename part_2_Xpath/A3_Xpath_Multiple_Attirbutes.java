package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Xpath_Multiple_Attirbutes {

	public static void main(String[] args)throws Exception
	{
		//here we use "AND" and  "OR" operators to use
		//multiple attributes
//syntax :tagname[@Attribute name='Attribute values' AND @Attribute name='Attribute values']
//syntax :tagname[@Attribute name='Attribute values' OR @Attribute name='Attribute values']
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files-20240910T090302Z-001/Html%20files/sampleHtmlcode1.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' and @class='fname']")).sendKeys("subbu");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' or @name='fname']")).sendKeys("pusapati");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit' and @value='submit']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		// TODO Auto-generated method stub

	}

}
