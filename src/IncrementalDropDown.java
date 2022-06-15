import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncrementalDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Select values from Incremental Dropdown by using Automation script...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Get URL for Automation Script...
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Maximize window...
		driver.manage().window().maximize();

		// Dropdown with Incremental Value...
		WebElement PassengerDD = driver.findElement(By.id("divpaxinfo"));
		PassengerDD.click();
		Thread.sleep(1000);
	
		// Passenger's Values increase/Decrease using For() Loop ...
		WebElement PassengerIncAdt = driver.findElement(By.id("hrefIncAdt"));
		WebElement PassengerDecAdt = driver.findElement(By.id("hrefDecAdt"));
				
		WebElement PassengerIncChild = driver.findElement(By.id("hrefIncChd"));
		WebElement PassengerDecChild = driver.findElement(By.id("hrefDecChd"));
				
		WebElement PassengerIncInf = driver.findElement(By.id("hrefIncInf"));
		WebElement PassengerDecInf = driver.findElement(By.id("hrefDecInf"));
			
		// Find Element for Done Button Available in Pessmeger's DropDown List ....
		WebElement PassengerDone = driver.findElement(By.className("buttonN"));
				
		// Increase / Decrease Adult's Buttons are displayed or not...
		System.out.println("Increase Adult Button is Displayed: " + PassengerIncAdt.isDisplayed());
		System.out.println("Decrease Adult Button is Displayed: " + PassengerDecAdt.isDisplayed());
				
		// Increase / Decrease Adult's Buttons are Enabled or not...
		System.out.println("Increase Adult Button is Enabled: " + PassengerIncAdt.isEnabled());
		System.out.println("Decrease Adult Button is Enabled: " + PassengerDecAdt.isEnabled());
						
		// Increase / Decrease Child's Buttons are displayed or not...
		System.out.println("Increase Child Button is Displayed: " + PassengerIncChild.isDisplayed());
		System.out.println("Decrease Child Button is Displayed: " + PassengerDecChild.isDisplayed());
						
		// Increase / Decrease Child's Buttons are Enabled or not...
		System.out.println("Increase Child Button is Enabled: " + PassengerIncAdt.isEnabled());
		System.out.println("Decrease Child Button is Enabled: " + PassengerDecAdt.isEnabled());
				
		// Increase / Decrease INFANT's Buttons are displayed or not...
		System.out.println("Increase Infant Button is Displayed: " + PassengerIncInf.isDisplayed());
		System.out.println("Decrease Infant Button is Displayed: " + PassengerDecInf.isDisplayed());
				
		// Increase / Decrease INFANT's Buttons are Enabled or not...
		System.out.println("Increase Infant Button is Enabled: " + PassengerIncInf.isEnabled());
		System.out.println("Decrease Infant Button is Enabled: " + PassengerDecInf.isEnabled());
				
		// Done Button is Displayed & Enabled in Pessenger's Dropdown List ...
		System.out.println("Done Button is Displayed in Passenger Dropdown List: " + PassengerDone.isDisplayed());
		System.out.println("Done Button is Enabled in Passenger Dropdown List: " + PassengerDone.isEnabled());
				
		// Increase Adults Values...
		for (int i=1;i<=4;i++)
		{
			PassengerIncAdt.click();
		}
		System.out.println("Selected Values are: " + PassengerDD.getText());
				
		// Increase Child Values...
		for (int i=1;i<=4;i++)
		{
			PassengerIncChild.click();
		}
		System.out.println("Selected Values are: " + PassengerDD.getText());
				
		// Increase INFANT Values...
		for (int i=1;i<=2;i++)
		{
			PassengerIncInf.click();
		}
		System.out.println("Selected Values are: " + PassengerDD.getText());
		Thread.sleep(1000);
				
		// Decrease Adults Values...
		for (int d=1;d<=2;d++)
		{
			PassengerDecAdt.click();
		}
		System.out.println("After Decrease Adult Values are: " + PassengerDD.getText());
				
		// Decrease Child Values...
		for (int d=1;d<=2;d++)
		{
			PassengerDecChild.click();
		}
		System.out.println("After Decrease Child Values are: " + PassengerDD.getText());
				
		// Decrease INFANT Values...
		for (int d=1;d<=1;d++)
		{
			PassengerDecInf.click();
		}
		System.out.println("After Decrease INFANT Values are: " + PassengerDD.getText());
				
		// Click on Done Button in Passenger Dropdown list ...
		PassengerDone.click();
				
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Final, Selected Passenger's Details are: " + PassengerDD.getText());
		System.out.println("----------------------------------------------------------------------");
			
		Thread.sleep(3000);
		driver.close();		
	}

}
