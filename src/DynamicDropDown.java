import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Select values from Dynamic Drop down by using Automation script...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Get URL for Automation Script...
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Maximize window...
		driver.manage().window().maximize();
		
		// Departure Drop Down - Element Using Xpath contains...
		WebElement FromDropDown = driver.findElement(By.xpath("//input[contains(@id,'originStation1')]"));
		// Departure Drop Down is displayed & Enabled or not ...
		System.out.println("Departure Dropdown is Displayed: " + FromDropDown.isDisplayed());
		System.out.println("Departure Dropdown is Enabled: " + FromDropDown.isEnabled());
		FromDropDown.click();
		
		WebElement SearchDD = driver.findElement(By.xpath("//div[contains(@class,'search_options_menucontentbg')]"));
		// Print all Places name available in From DropDown List ...
		System.out.println("----------------------------------------------------------------------");
		System.out.println("***** List of Places available in 'Departure Drop-Down': ***** ");
		System.out.println(SearchDD.getText());
		System.out.println("----------------------------------------------------------------------");
		
		// Find Dynamic Element by using contains Xpath...
		WebElement SelFromDD = driver.findElement(By.xpath("//a[contains(@value,'BLR')]"));
		SelFromDD.click();
		System.out.println("Selected Values in Departure Drop-Down List is: " + SelFromDD.getText());
		
		// Arrival Drop Down - Element Using Xpath contains...
		WebElement ToDropDown = driver.findElement(By.xpath("//input[contains(@id,'destinationStation1')]"));
		// Arrival Drop Down is displayed & Enabled or not ...
		System.out.println("Arrival Dropdown is Displayed: " + ToDropDown.isDisplayed());
		System.out.println("Arrival Dropdown is Enabled: " + ToDropDown.isEnabled());
		ToDropDown.click();
	
		WebElement SearchToDD = driver.findElement(By.xpath("//div[contains(@id,'destinationStation1')]"));
		// Print all Places name available in From DropDown List ...
		System.out.println("----------------------------------------------------------------------");
		System.out.println("***** List of Places available in 'Arrival Drop-Down': ***** ");
		System.out.println(SearchToDD.getText());
		System.out.println("----------------------------------------------------------------------");
				
		// Find Dynamic Element by using contains Xpath...
		WebElement SelToDD = driver.findElement(By.xpath("(//a[contains(@value,'MAA')])[2]"));
		SelToDD.click();
		System.out.println("Selected Values in Arrival Drop-Down List is: " + SelToDD.getText());
				
		
		Thread.sleep(3000);
		driver.close();
	}

}
