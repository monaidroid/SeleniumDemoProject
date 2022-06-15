import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingFooterprint 
{

	public static void main(String[] args) 
	{
		// Booking.com Footer links texts print using For() loop....
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Load Booking.com Website....
		driver.get("https://www.booking.com/");
		
		// Footer Text get & Print using gettext() & Println()....
		/*
		WebElement FooTxt = driver.findElement(By.xpath("//*[@id=\'footer\']"));
		System.out.println(FooTxt.getText());
		*/
		
		// All Footer Elements stored in single element with the help of List<WebElement> .....
		List<WebElement> FooTxts = driver.findElements(By.xpath("//*[@id=\'footer\']//a"));
		System.out.println("Total Nos of Links Available in Footer are: " + FooTxts.size());
		
		// All Links Available in Footer section of Booking.com website, Print with the help of For()loop ...
		System.out.println("********************************************");
		
		for (WebElement eles:FooTxts)
		{
			System.out.println(eles.getText());
		}
		
		System.out.println("********************************************");
		System.out.println("All Link titles are Printed successfully!!! ");
		// Close Browser.....	
		driver.close();
	}

}
