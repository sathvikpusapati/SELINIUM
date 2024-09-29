package Day3_17_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B4_For_Each_Loop_Task {

	public static void main(String[] a) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files-20240910T090302Z-001/Html%20files/groupbyindex.html");
		
		Thread.sleep(2000);
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count=list.size();
		
		System.out.println(count);
		
		//using for loop
		
		for(int i=0;i<count;i++)
		{
			WebElement box= list.get(i);
			
			box.click();
			
			Thread.sleep(50);
		}
		
		for(int i=0;i<count;i++)
		{	
			if(i % 2 == 0)
			{ WebElement box= list.get(i);
			
			  box.click();
			
			  Thread.sleep(50);
			}
		}
		
		//using for each loop
		
		
		for(WebElement box : list)
		{
			box.click();
			
			Thread.sleep(50);
		}
		
		
		driver.quit();
		
		
	}
}
