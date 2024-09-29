package Day1_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] k)throws Exception
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("pusapatisathvik@gmail.com");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
			
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Mobiles")).click();
		
		Thread.sleep(4000); 
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
