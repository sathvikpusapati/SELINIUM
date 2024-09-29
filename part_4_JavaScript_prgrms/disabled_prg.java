package Day4_JavaScript_prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class disabled_prg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//to find and use disabled elements we use executescript
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ASUS/Desktop/HEMANTH%20EXCELR/Html%20files/disabled_javascript.html");
		
		WebElement disabled=driver.findElement(By.xpath("//input[@id='text1']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		
		
		//first method
		
		js.executeScript("document.getElementById('text1').value='pusapati '");
		
		Thread.sleep(2000);
		
		//second method
		
		js.executeScript("arguments[0].value='sathvik'", disabled);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='text2']")).sendKeys("Raju");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
