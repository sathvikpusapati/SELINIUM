package Day3_17_WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B2_Find_All_Links {
	
	public static void main(String [] a) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in/");
		
		//to find number of links or all links
		
		List<WebElement> all_links=driver.findElements(By.xpath("//a"));
		
		int links_count=all_links.size();
		
		System.out.println("number of links = "+links_count);
		
		//to find all images
		
		List<WebElement> imgs=driver.findElements(By.tagName("img"));
		
		int imgs_count=imgs.size();
		
		System.out.println("number of images = "+imgs_count);
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
