package Day4_Dropdowns_Actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A7_DropDown_task3_Smart {

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
		
		ArrayList<String> ar1=new ArrayList();//creating array list of string type
		
		for(WebElement d : opt1)
		{
			String txt=d.getText();
			ar1.add(txt);//adding string to array list of string type
		}
		
		System.out.println(ar1);
		
		ArrayList<String> ar3=new ArrayList<>(ar1);
		
		List<WebElement> opt2=sel2.getOptions();
		
		int count2=opt2.size();
		
		ArrayList<String> ar2=new ArrayList();
		
		for(WebElement d : opt2)
		{
			String txt=d.getText();
			ar2.add(txt);
		}
		
		System.out.println(ar2);
		
		ar1.retainAll(ar2);//removes unique items
		
		System.out.println("Following are duplicates : ");
		System.out.println(ar1);
		
		
		ar3.removeAll(ar2);//remove duplicates 
		
		System.out.println("Following are unique Elements :\n"+ar3);
		
		
		
		
		driver.quit();
	}
}
