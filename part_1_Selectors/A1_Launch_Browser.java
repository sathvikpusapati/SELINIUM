package Day1_Selectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_Launch_Browser {

	public static void main(String [] p)throws Exception
	{
		//no need to use this statement System.setProperty();
	
		WebDriver driver=new ChromeDriver(); //cntrl + shift + o to import required packages
	
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		
		
		String title,url;
		
		title=driver.getTitle();
		url=driver.getCurrentUrl();
		
		System.out.println("page title : "+title+"\nweb address : "+url);
		
		driver.quit();
	}
}
