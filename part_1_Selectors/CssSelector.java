package Day1_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] mn)throws Exception
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[class='_aa4b _add6 _ac4d _ap35']")).sendKeys("sathvik@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sathvik");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class=' _acan _acao _acat _aj1- _ap30']")).click();
		
		Thread.sleep(2000);
		
		
		
		driver.quit();
	}
}
