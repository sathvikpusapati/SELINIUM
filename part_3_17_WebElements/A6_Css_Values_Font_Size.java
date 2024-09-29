package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A6_Css_Values_Font_Size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement Tooltip=driver.findElement(By.xpath("//a[text()='తెలుగు']"));
		
		String tooltip_size=Tooltip.getCssValue("font-size");
		
		String Cssvalue=Tooltip.getCssValue("font-family");
		
		String Csscolor=Tooltip.getCssValue("color");
		
		System.out.println("Font size : "+tooltip_size+"\n Font family : "+Cssvalue+"\n Font color : "+Csscolor );
		
		Tooltip.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
