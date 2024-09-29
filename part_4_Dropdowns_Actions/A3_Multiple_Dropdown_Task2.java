package Day4_Dropdowns_Actions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class A3_Multiple_Dropdown_Task2 {

	public static void main(String[] args)throws Exception 
	
	{
		// TODO Auto-generated method stub
		
			
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/Multiple_dropdown.html");
			
			WebElement drop=driver.findElement(By.id("dropdown"));
			
			Select sel=new Select(drop);
			
			List<WebElement> all=sel.getOptions();
			
			int count=all.size();
			
			for(int i=0;i<count;i++)
			{
				sel.selectByIndex(i);
				Thread.sleep(1000);
			}
			
			sel.deselectAll();
			Thread.sleep(2000);
			
			driver.quit();
			
			
	}

}
