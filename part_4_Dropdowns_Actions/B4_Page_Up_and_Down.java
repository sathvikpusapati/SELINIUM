package Day4_Dropdowns_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B4_Page_Up_and_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Actions act=new Actions(driver);
		
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
																																																																																																																																																																				
		
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.PAGE_DOWN);//it wil down 2 times
	
		Thread.sleep(1000);
		
		act.sendKeys(Keys.PAGE_UP);//it will up one time only so we used two page up's 
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.PAGE_UP);
		
		Thread.sleep(1000);
		
		//right click on mobile tab
		
		act.contextClick(mobile).perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		
	
	}

}
