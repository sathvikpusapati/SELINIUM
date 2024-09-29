package Day2_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadhicom_Xpath {

	public static void main(String[]dd)throws Exception
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shaadi.com/join-now?ptnr=sribrnext09&gad_source=1&gclid=Cj0KCQjw9Km3BhDjARIsAGUb4nz7295FbfhlVdqruJoEF2wIZQbua0oyZcEAyS-Cq0-Kp3Eet_Jf8B4aAiNAEALw_wcB");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		
		Thread.sleep(2000);
		
		WebElement txt=driver.findElement(By.xpath("//label[contains(text(),'Mobile ')]"));
		
		String text=txt.getText();
		
		System.out.println(text);
		
		
		WebElement txt1=driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]"));
		
		String text1=txt1.getText();
		
		System.out.println(text1);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("satvhik@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("satvhik");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='autologin']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		
		driver.quit();
		
		
		
	}
}
