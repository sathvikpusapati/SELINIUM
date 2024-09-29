package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_IS_Selected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		
		WebElement dd=driver.findElement(By.id("domain1"));
		
		dd.click();
		
		if(dd.isSelected())
		{
			System.out.println("yes checkbox selected");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("not selected");
		}
		
		driver.quit();
	}

}
