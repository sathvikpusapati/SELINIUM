package Day4_Dropdowns_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A8_Action_Class_Prg1 {

	public static void main(String[]a) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		WebElement fash=driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		act.moveToElement(fash).click().perform();
		
		Thread.sleep(2000);
		
		WebElement men=driver.findElement(By.xpath("//span[text()='Men']"));
		
		act.moveToElement(men).click().perform();
		
		Thread.sleep(2000);
		
		WebElement shoe=driver.findElement(By.xpath("//a[text()='Formal Shoes']"));
		
		act.moveToElement(shoe).click().perform();
		
		Thread.sleep(3000);
		
		System.out.println(driver.manage().getCookies());
		
		driver.manage().deleteAllCookies();
		
		driver.quit();
		
		
		
	}
}
