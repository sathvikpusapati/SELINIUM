package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_Following_Siblings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to get text with non breakable space we use contains method
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/players.html");
		
	
		driver.manage().window().maximize();
		
		WebElement txt=driver.findElement(By.xpath("//td[contains(text(),'ABD')]/following-sibling::td[1]"));
		
		String text=txt.getText();
		
		WebElement txt1=driver.findElement(By.xpath("//td[contains(text(),'1')]/following-sibling::td[2]"));
		
		String text1=txt1.getText();
		
		System.out.println(text+" "+text1);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
}
