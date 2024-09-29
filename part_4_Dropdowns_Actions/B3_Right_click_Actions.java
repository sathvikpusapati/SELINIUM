package Day4_Dropdowns_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B3_Right_click_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		Actions act=new Actions(driver);
		
		WebElement circle=driver.findElement(By.id("circle"));
		
		
		
		act.clickAndHold(circle).perform();//click and hold particular element
		
		Thread.sleep(2000);
		
		act.contextClick(circle).perform();//right_click on particular element
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
