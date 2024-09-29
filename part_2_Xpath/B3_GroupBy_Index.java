package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B3_GroupBy_Index {

	public static void main(String [] mm) throws InterruptedException
	{
		//ippudu ikkada 2 search boxes unnai manam index vaadi second dhi use chesaam
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ipchesaam@gmail.com");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
