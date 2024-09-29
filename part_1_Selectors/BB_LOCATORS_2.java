package Day1_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BB_LOCATORS_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("athvik@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("athvikkk");
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("తెలుగు")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("F")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='_9bq5']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("_97w4")).click();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		driver.quit();
		
		
	}

}
