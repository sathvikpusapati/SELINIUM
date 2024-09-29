package Day1_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_LOCATORS_1 {
	
	public static void main(String [] a) throws InterruptedException
	{	//creating universal driver variable and launching chrome driver
		WebDriver driver=new ChromeDriver();
		//opening url in chrome browser
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files-20240910T090302Z-001/Html%20files/sampleHtmlcode1.html");
		
		//maximizing the browser window
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		
		//* if address is Matching With Multiple Elements
		//Then find Element Will  fetch the address of 1st Matching Element 
		driver.findElement(By.tagName("input")).sendKeys("sathvik");
		
		Thread.sleep(2000);
		//sending data 
		driver.findElement(By.id("lname")).sendKeys("raju");

		Thread.sleep(2000);
		
		driver.findElement(By.className("fname")).sendKeys("subbu");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		driver.quit();		
	}

}
