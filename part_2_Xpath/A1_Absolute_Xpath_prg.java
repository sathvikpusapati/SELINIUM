package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Absolute_Xpath_prg {

	public static void main(String[] args)throws Exception 
	{
		//we use "/" to traverse from parent to specific child(immediate child)
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files-20240910T090302Z-001/Html%20files/players.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		// TODO Auto-generated method stub

	}

}
