package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5_NBSP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to get text with non breakable space we use contains method
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/nbsp.html");
		
		driver.manage().window().maximize();
		
		
		
		
		WebElement txt = driver.findElement(By.xpath("//span[contains(text(),'inst')]"));
		
		String text=txt.getText();
		
		Thread.sleep(2000);
		
		System.out.println(text);
		
		driver.quit();
		
	}

}
