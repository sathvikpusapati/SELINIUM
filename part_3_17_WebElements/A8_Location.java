package Day3_17_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A8_Location {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement loca=driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		
		Point location=loca.getLocation();
		
		System.out.println(location);
		
		//if we use .getLocation() we get both x axis and y axis
		
		//to get any one this we use .getX() .getY() 
		
		Point location2=loca.getLocation();
		
		int x=location2.getX();
		
		System.out.println(x);
		
		int y=location2.getY();
		
		System.out.println(y);
		
		
	
		Thread.sleep(2000);
		
		driver.quit();
	}
}
