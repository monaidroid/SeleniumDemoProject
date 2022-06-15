import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingExpIND 
{

	public static void main(String[] args) 
	{
		// Booking.com Footer links texts print using For loop....
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Load Booking.com Website....
		driver.get("https://www.booking.com/");
	
		// Explore INDIA Title get & Print it...
		System.out.println("****** Title is: ******");
		WebElement ExpINDTitle = driver.findElement(By.xpath("//*[@id='basiclayout']//div[7]//div[1]"));
		System.out.println(ExpINDTitle.getText());
		System.out.println("**************************************");
		
		// Explore INDIA -> All Places Title & Properties get & Print...
		System.out.println("All Places Name & Nos of Properties are as Listed below: ");
		WebElement ExpIND = driver.findElement(By.xpath("//*[@id='basiclayout']//div[7]//div[2]"));
		System.out.println(ExpIND.getText());
		System.out.println("**************************************");
		
		// Close Browser.....
		driver.close();

	}

}
