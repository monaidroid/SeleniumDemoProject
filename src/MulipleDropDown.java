import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MulipleDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Select Values from Multiple Drop down with one Method only ...
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement autoDrp = driver.findElement(By.id("autosuggest"));
		autoDrp.sendKeys("IN");
		Thread.sleep(3000);
		
		List<WebElement> autoDropDown = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement country:autoDropDown)
		{
			if (country.getText().equals("India"))
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Selected Country From Autosuggestion Dropdown is: " + country.getText());
				System.out.println("----------------------------------------------------------");
				country.click();
				break;
			}
		}
		
		WebElement departureDRP = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		departureDRP.click();
		List<WebElement> departureList = driver.findElements(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"]//a"));
		for (WebElement departureCountry:departureList)
		{
			if (departureCountry.getText().equals("Jaipur (JAI)"))
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Selected City From Departure Dropdown is: " + departureCountry.getText());
				System.out.println("----------------------------------------------------------");
				departureCountry.click();
				break;
			}
		  /*else
			{
				System.out.println("Given Country Name is not available in List of Departure City Dropdown");
				break;
			}*/
		}
		
		WebElement arrivalDRP = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		arrivalDRP.click();
		List<WebElement> arrivalList = driver.findElements(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a"));
		for (WebElement arrivalCountry:arrivalList)
		{
			if (arrivalCountry.getText().equals("Goa (GOI)"))
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Selected City From Arrival Dropdown is: " + arrivalCountry.getText());
				System.out.println("----------------------------------------------------------");
				arrivalCountry.click();
				break;
			}
			/*else
			{
				System.out.println("Given Country Name is not available in List of Arrival City Dropdown");
				break;
			}*/
		}
		Thread.sleep(3000);
		driver.close();
	}

}
