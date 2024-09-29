package Day4_Dropdowns_Actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A5_Dropdown_Task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/Single_and_Multiple_dropdown.html");
		
		WebElement single=driver.findElement(By.id("dropdown"));
		WebElement multi=driver.findElement(By.xpath("//select[@multiple]"));
		
		Select sel1=new Select(single);
		Select sel2=new Select(multi);
		
		List<WebElement> opt1=sel1.getOptions();
		
		int count1=opt1.size();
		
		ArrayList<String> ar1=new ArrayList();
		
		for(WebElement d : opt1)
		{
			String txt=d.getText();
			ar1.add(txt);
		}
		
		List<WebElement> opt2=sel2.getOptions();
		
		int count2=opt2.size();
		
		ArrayList<String> ar2=new ArrayList();
		
		for(WebElement d : opt2)
		{
			String txt=d.getText();
			ar2.add(txt);
		}
		
		ArrayList<String> duplicate=new ArrayList();
		
		ArrayList<String> unique=new ArrayList();
		
		for(int i=0; i<count1;i++)
		{
			String txt1 []=new String[count1];//creating string type array
			
			txt1[i]=ar1.get(i);

		}
		
		for(int i=0; i<count2;i++)
		{
			String txt2 []=new String[count1];
			
			txt2[i]=ar2.get(i);

		}
		
		
		
		
		
		Thread.sleep(2000);
		
		System.out.println("Duplicates : "+duplicate);
		
		System.out.println("\nunique : "+unique);
		
		driver.quit();
		
	}

}
