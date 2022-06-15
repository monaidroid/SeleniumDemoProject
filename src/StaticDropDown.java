import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Select values from static Dropdown by using Automation script...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Maximize window...
		driver.manage().window().maximize();
			
		// Select Values from Currency DropDown List ........
		// WebElement CurDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		// WebElement Using Contains Xpath...
		WebElement CurDropdown = driver.findElement(By.xpath("//*[contains(@id,'DropDownListCurrency')]"));
		
		System.out.println("Currency Drop Down is Displayed: " + CurDropdown.isDisplayed());
		System.out.println("Currency Drop Down is Enabled: " + CurDropdown.isEnabled());
		
		// Static DropDown - Always, Start with Select & Option tags....
		Select DropdownCurrency = new Select(CurDropdown);
		
		System.out.println("----------------------------------------------------------------------");
		// Select Values from DropDown by using SelectByIndex() Method...
		DropdownCurrency.selectByIndex(3);
		System.out.println("Currency Selected by Index is: " + DropdownCurrency.getFirstSelectedOption().getText());
		
		// Select Values from DropDown by using SelectByValue() Method..
		DropdownCurrency.selectByValue("AED");
		System.out.println("Currency Selected by Value is: " + DropdownCurrency.getFirstSelectedOption().getText());
				
		// Select Values from DropDown by using SelectBy
		DropdownCurrency.selectByVisibleText("INR");
		System.out.println("Currency Selected by Visible Text is: " + DropdownCurrency.getFirstSelectedOption().getText());
		System.out.println("----------------------------------------------------------------------");
		
		Thread.sleep(3000);
		driver.close();

	}

}
