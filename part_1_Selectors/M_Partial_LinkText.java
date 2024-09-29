package Day1_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_Partial_LinkText {

	public static void  main(String [] mm) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		//here i am using only half of the linktext because it have space in between
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
