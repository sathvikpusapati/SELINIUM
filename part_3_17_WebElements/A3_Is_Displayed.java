package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A3_Is_Displayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("sa@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sa@gmailcom");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebElement dd=driver.findElement(By.xpath("//span[contains(text(),'Login ')]"));
		
		
		
		if(dd.isDisplayed())
		{
			System.out.println("yes message displayed");
			
			String t1=dd.getTagName();
			
			String t2=dd.getText();
			Thread.sleep(2000);
			
			System.out.println(t1+" \n"+t2);
		}
		else
		{
			System.out.println("message not displayed");
		}
		
		driver.quit();
	}

}
