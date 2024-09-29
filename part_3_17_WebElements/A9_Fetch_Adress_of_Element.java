package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A9_Fetch_Adress_of_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement login=driver.findElement(By.id("email"));
		
		Thread.sleep(2000);
		
		login.sendKeys("athvik@hamil.com",Keys.TAB,"sathvikk",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
