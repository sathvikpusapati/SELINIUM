package Day1_Selectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11_Fetch_Title_of_page {

	public static void main(String[] a) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zebronics.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String title=driver.getTitle(),url=driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(url);
		
		driver.quit();
		
		
	}
}
