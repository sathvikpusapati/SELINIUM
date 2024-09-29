package Day4_Dropdowns_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B2_Double_Click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sathvik");
		
		Thread.sleep(2000);
		
		WebElement eye=driver.findElement(By.xpath("//img[@class='w-6 h-6 mt-4 absolute ml-72 cursor-pointer']"));
		
		act.doubleClick(eye).perform();
		
		Thread.sleep(2000);
		
		eye.click();//or act.click().perform();
		driver.quit();
		
	}

}
