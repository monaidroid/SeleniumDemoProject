import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Select Values from Auto Suggestion Drop Down using Automation Script..
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Get URL for Automation Script...
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Send values in Auto Suggestion Drop Down... 
		WebElement countryDropdown = driver.findElement(By.id("autosuggest"));
		countryDropdown.sendKeys("IN");
		Thread.sleep(3000);
		
		// Get Values from List of Auto Suggestion Drop Down...
		List<WebElement> countryList = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		System.out.println("***** Available Country List is: *****");
		for (WebElement country:countryList)
		{
			System.out.println(country.getText());
			if (country.getText().equals("India"))
			{
				System.out.println("----------------------------------------------------------");
				System.out.println("Selected Country From Autosuggestion Dropdown is: " + country.getText());
				System.out.println("----------------------------------------------------------");
				country.click();
				break;
			}
			
		}
		
		/*
		// Apply Tick in One Way Radio Button .....
		WebElement onewayRadio = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		System.out.println("----------------------------------------------");
		System.out.println("One Way Radio Button is Displayed: " + onewayRadio.isDisplayed());
		System.out.println("One Way Radio Button is Enabled: " + onewayRadio.isEnabled());
		System.out.println("One Way Radio Button is Selected: " + onewayRadio.isSelected());
		System.out.println("----------------------------------------------");
		
		// Check whether RoundTrip Radio is displayed, Enabled & selected/deselected ....
		WebElement roundtripRadio = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		System.out.println("Round Trip Radio Button is Displayed: " + roundtripRadio.isDisplayed());
		System.out.println("Round Trip Radio Button is Enabled: " + roundtripRadio.isEnabled());
		
		System.out.println("Round Trip Radio Button is Selected: " + roundtripRadio.isSelected());
		System.out.println("----------------------------------------------");
		// Apply Tick ON In Student Check Box...
		WebElement studCheckbox = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		System.out.println("Student CheckBox is Displayed: " + studCheckbox.isDisplayed());
		System.out.println("Student CheckBox is Enabled: " + studCheckbox.isEnabled());
		System.out.println("Student CheckBox is Selected: " + studCheckbox.isSelected());
		studCheckbox.click();
		System.out.println("Now, Student CheckBox is Selected: " + studCheckbox.isSelected());
		*/
		
		driver.close();
		
	}

}
