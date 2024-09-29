package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1_IS_Enabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//opens fire fox browser
		WebDriver driver= new FirefoxDriver();
		
		//maximize the window size
		driver.manage().window().maximize();
		
		//opens the entered url
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		
		
		WebElement ch=driver.findElement(By.xpath("//button[@id='submitButton']"));
		
		//WebElement ch=driver.findElement(By.id("btn10"));
		
		if(ch.isEnabled()) 
		{
			System.out.println("yes button enabled");
			
			ch.click();
			
			Thread.sleep(2000);
		}
		else
		{
			
			System.out.println("button ledu");
		}
		
		driver.quit();
	}

}
