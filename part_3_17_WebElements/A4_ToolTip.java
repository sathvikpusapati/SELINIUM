package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A4_ToolTip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//opens fire fox browser
		WebDriver driver= new FirefoxDriver();
		
		//maximize the window size
		driver.manage().window().maximize();
		
		//opens the entered url
		driver.get("https://www.facebook.com/");
		
		
		WebElement telugu=driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		
	
		String Tooltip=telugu.getAttribute("Title");
		
		String link=telugu.getAttribute("href");
			
		
		System.out.println(Tooltip);
		
		System.out.println(link);
		
		
			
			
			telugu.click();
			Thread.sleep(2000);
			driver.quit();
		
	}
}
