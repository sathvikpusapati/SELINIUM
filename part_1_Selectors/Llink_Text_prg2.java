package Day1_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Llink_Text_prg2 {

	public static void main(String [] mk) throws Exception
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("తెలుగు")).click();
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
