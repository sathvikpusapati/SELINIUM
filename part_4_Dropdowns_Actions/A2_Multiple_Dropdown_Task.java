package Day4_Dropdowns_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A2_Multiple_Dropdown_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/Multiple_dropdown.html");
		
		WebElement drop=driver.findElement(By.id("dropdown"));
		
		Select sel=new Select(drop);
		
		if(sel.isMultiple())
		{
			List<WebElement> options=sel.getOptions();
			
			int count=options.size();
			
			System.out.println("multiple dropdown size is " + count);
			
			for(WebElement txt : options)
			{
				String text=txt.getText();
				
				System.out.println(text);
			}
			
			sel.selectByIndex(0);
			Thread.sleep(1000);
			
			sel.selectByValue("B");
			Thread.sleep(1000);
			
			sel.selectByVisibleText("Nayanathara");
			Thread.sleep(1000);
			
			sel.selectByValue("D");
			Thread.sleep(1000);
			
			//deselecting a element in dropdown
			
			sel.deselectByIndex(1);
			Thread.sleep(1000);
			
			List<WebElement> options2=sel.getAllSelectedOptions();
			
			for(WebElement d : options2)
			{
				String txt1=d.getText();
				
				if(txt1.equalsIgnoreCase("Anushka"))
				{
					System.out.println("she is present " +txt1);
					System.out.println("now i am removing her");
					sel.deselectByVisibleText("Anushka");
					Thread.sleep(2000);
				}
				else if(txt1.equalsIgnoreCase("nayanathara"))
				{
					System.out.println("she is present " +txt1);
					System.out.println("now i am removing her");
					sel.deselectByVisibleText("Nayanathara");
					Thread.sleep(2000);
				}
			}
			
			WebElement first=sel.getFirstSelectedOption();
			
			String f=first.getText();
			
			System.out.println("Firts selected option is "+f);
		}
		else
		{
			System.out.println("single select dropdown");
			sel.selectByValue("A");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
