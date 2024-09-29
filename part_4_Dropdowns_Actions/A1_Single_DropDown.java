package Day4_Dropdowns_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_Single_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/Single_dropdown.html");
		
		//select dropdown
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		//creating reference variable of select type with dropdown as adress as parameter
		Select sel=new Select(dropdown);
		
		driver.findElement(By.xpath("//select[@id='dropdown']")).click();
		
		sel.selectByIndex(2);
		
		if(sel.isMultiple())
		{
			System.out.println("multiple dropdown");
		}
		else
		{
			System.out.println("Single dropdown");
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
