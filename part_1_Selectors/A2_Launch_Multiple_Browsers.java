package Day1_Selectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_Launch_Multiple_Browsers {



		public static WebDriver driver;
	
		public static String  title,url;
	
	public static void main(String[] a) throws Exception
	{
		
		
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.samsung.com/");
		
		Thread.sleep(2000);
		
		
		
		title=driver.getTitle();
		url=driver.getCurrentUrl();
		
		System.out.println("\npage title : "+title+"\npage url : "+url);
		
		driver.quit();
		
		
		
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.asus.com/");
		
		Thread.sleep(2000);
		
		
		
		title=driver.getTitle();
		url=driver.getCurrentUrl();
		
		System.out.println("\npage title : "+title+"\npage url : "+url);
		
		driver.quit();
		
		
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.sony.com/");
		
		Thread.sleep(2000);
		
		
		
		title=driver.getTitle();
		url=driver.getCurrentUrl();
		
		System.out.println("\npage title : "+title+"\npage url : "+url);
		
		driver.quit();
		
	}
}
