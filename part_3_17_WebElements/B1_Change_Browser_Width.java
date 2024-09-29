package Day3_17_WebElements;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B1_Change_Browser_Width {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//to change browser size
		
		Dimension d=new Dimension(1200,1500);
		
		driver.manage().window().setSize(d);
		
		//to drag the scroll bar
		
		Point p=new Point(300,500);
		
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
