import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithContains 
{

	public static void main(String[] args) 
	{
		// Xpath With Contains....
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Load UPWpork Website ....
		driver.get("https://www.facebook.com/");
		
		// Sign UP Button Access using Xpath Contains...
		WebElement LoginBtn = driver.findElement(By.xpath("//*[contains(@name,'login')]"));
		LoginBtn.click();
		
				
	}

}
