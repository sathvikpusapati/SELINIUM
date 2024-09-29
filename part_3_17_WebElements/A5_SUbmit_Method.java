package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A5_SUbmit_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sa@gmailcom");
		driver.findElement(By.xpath("//button[@value='1']")).submit();//instead of click() we are using submit()
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
