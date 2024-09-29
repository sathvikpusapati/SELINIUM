package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_Descendant_Tag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to get text with non breakable space we use contains method
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/players.html");
		
	
		driver.manage().window().maximize();
		
		WebElement txt=driver.findElement(By.xpath("//body/descendant::td[contains(text(),'Vira')]"));
		
		String text=txt.getText();
		
		System.out.println(text);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
}
