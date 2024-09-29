package Day1_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text_prg1 {

	public static void main(String[]sm) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//linktext is used to open a text with a link we get underline when we place cursor on it
		driver.findElement(By.linkText("తెలుగు")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("हिन्दी")).click();
		
		Thread.sleep(2000);
		
		//accepting cookies will store our actions in history
		//to delete that we use this method
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
}
