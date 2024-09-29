package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A7_Height_Width {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement lg=driver.findElement(By.xpath("//button[@name='login']"));
		
		Dimension size=lg.getSize();
		
		System.out.println(size);
		
		//if we use .getSize() we get both width and height
		
		//to get any one that is width or height we use .getWidth() .getHeight() 
		
		Dimension size2=lg.getSize();
		
		int width=size2.getWidth();
		
		System.out.println(width);
		
		int height=size2.getHeight();
		
		System.out.println(height);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
