import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class betaSpicejetScript 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// SpiceJet.com Automation script... 
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		// open Spicejet.com website & maximize browser window...
		//driver.get("https://www.spicejet.com/")
		//driver.get("https://beta.spicejet.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		// Select Value From Departure City Drop down.....
		WebElement departureDRP = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']"));
		departureDRP.click();   // glsctl00_mainContent_ddl_originStation1_CTNR
		Thread.sleep(500);
		List<WebElement> departureList = driver.findElements(By.xpath("//div[@data-testid='to-testID-origin']//div[2]//div[2]"));
		selectVlauesFromDRP(departureList,"Jaipur");
		
		Thread.sleep(1000);

	}
	//Own Method Creating for fetching values from Multiple Drop downs ...
		public static void selectVlauesFromDRP(List<WebElement> ele, String value)
		{
			for (WebElement option:ele)
			{
				if (option.getText().equals(value))
				{
					System.out.println("Selected Values From Dropdown is: " + option.getText());
					option.click();
					break;
				}
			}
		}

}
