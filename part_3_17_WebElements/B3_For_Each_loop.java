package Day3_17_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B3_For_Each_loop {

	public static void main(String[] a) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files-20240910T090302Z-001/Html%20files/groupbyindex.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement box : list)
		{
			box.click();
			
			Thread.sleep(300);
		}
		
		
		driver.quit();
		
		
	}
}
