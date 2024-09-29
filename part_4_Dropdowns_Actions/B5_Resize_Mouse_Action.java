package Day4_Dropdowns_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B5_Resize_Mouse_Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable/");
		
		Actions act=new Actions(driver);
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame1);
		
		WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		act.clickAndHold(resize).moveByOffset(100, 150).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
