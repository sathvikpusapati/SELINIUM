package Day4_Dropdowns_Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A4_Sorting_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/Multiple_dropdown.html");
		
		WebElement drop=driver.findElement(By.id("dropdown"));
		
		Select sel=new Select(drop);
		
		List<WebElement> opt=sel.getOptions();
		
		ArrayList<String> ar=new ArrayList();
		
		for(WebElement element : opt)
		{
			
			
			String txt=element.getText();
			ar.add(txt);
		}
		
		//we use inbuilt method
		Collections.sort(ar); //it will sort all elements automatically
		
		for(String s :ar)
		{
			System.out.println(s);
		}
		
		System.out.println("*********************************");
		Collections.sort(ar, Collections.reverseOrder());
		for(String s :ar)
		{
			System.out.println(s);
		}
		
		driver.quit();
		
	}

}
