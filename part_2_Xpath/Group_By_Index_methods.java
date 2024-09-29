package Day2_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_By_Index_methods {


	public static void main(String [] mm) throws InterruptedException
	{
		Group_By_Index_methods obj=new Group_By_Index_methods();
		
		obj.groupby();
		obj.last();
		obj.position_mod();
		obj.position_mod_odd();
		
		
	}
	
	public void groupby() throws InterruptedException
	{
		//ippudu ikkada 2 search boxes unnai manam index vaadi second dhi use chesaam
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/groupbyindex.html");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
				
				Thread.sleep(3000);
				
				driver.quit();
	}
	
	public void last() throws InterruptedException
	{
		//ippudu ikkada 2 search boxes unnai manam index vaadi second dhi use chesaam
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/groupbyindex.html");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("(//input[@type='checkbox'])[last()]")).click();
				
				Thread.sleep(3000);
				
				driver.quit();
	}
	
	public void position_mod() throws InterruptedException
	{
		//ippudu ikkada 2 search boxes unnai manam index vaadi second dhi use chesaam
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/groupbyindex.html");
				
				driver.manage().window().maximize();
				
				List<WebElement> list;
				list=driver.findElements(By.xpath("(//input[@type='checkbox'])[position() mod 2=0]"));
				
				for(WebElement ch : list)
				{
					Thread.sleep(2000);
					ch.click();
				}
				Thread.sleep(3000);
				
				driver.quit();
	}
	
	public void position_mod_odd() throws InterruptedException
	{
		//ippudu ikkada 2 search boxes unnai manam index vaadi second dhi use chesaam
				WebDriver driver=new ChromeDriver();
				
				driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/groupbyindex.html");
				
				driver.manage().window().maximize();
				
				List<WebElement> list=driver.findElements(By.xpath("(//input[@type='checkbox'])[position() mod 2=1]"));
				
				for(WebElement check :list )
				{
					Thread.sleep(2000);
					check.click();
				}
				
				Thread.sleep(3000);
				
				driver.quit();
	}
	
}
