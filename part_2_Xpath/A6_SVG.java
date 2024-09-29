package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A6_SVG {

	public static void main(String [] m) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
		
		driver.manage().window().maximize();
		
		
		
		
		driver.findElement(By.xpath("//th[contains(text(),'Samsu')]/../td[5]/div//*[local-name()='svg']")).click();
		
		
		
		Thread.sleep(2000);
		
		
		
		driver.quit();
	}
}
