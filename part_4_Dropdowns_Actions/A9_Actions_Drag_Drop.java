package Day4_Dropdowns_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class A9_Actions_Drag_Drop {

	public static void main(String[] args)throws Throwable 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
		
		Actions act=new Actions(driver);
		
		WebElement capital=driver.findElement(By.xpath("//div[@id='box6']"));
		Thread.sleep(1000);
		
		WebElement country=driver.findElement(By.xpath("//div[@id='box106']"));
		Thread.sleep(1000);
		
		act.dragAndDrop(capital, country).perform();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
