import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncrementDropDown 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		// Select Values from Incremental - Decremental Dropdown
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		// select values from Passengers Dropdown.....
		WebElement passengerDRP = driver.findElement(By.xpath("//div[@class='paxinfo']"));
		passengerDRP.click();
		WebElement adultIncValue = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		WebElement childIncValue = driver.findElement(By.xpath("//span[@id='hrefIncChd']"));
		WebElement infIncValue = driver.findElement(By.xpath("//span[@id='hrefIncInf']"));
		
		WebElement adultDecValue = driver.findElement(By.xpath("//span[@id='hrefDecAdt']"));
		WebElement childDecValue = driver.findElement(By.xpath("//span[@id='hrefDecChd']"));
		WebElement infDecValue = driver.findElement(By.xpath("//span[@id='hrefDecInf']"));
		WebElement passengerDetails = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		WebElement doneBtn = driver.findElement(By.xpath("//div[@class='ad-row align-center']//input"));
		
		// Call Method for Increase Values in Passenger Dropdown ....
		incrementValues(infIncValue , 3);
		incrementValues(childIncValue , 3);
		incrementValues(adultIncValue , 5);
		// Print Selected Values After Increment from Passengers Details Dropdown
		System.out.println("Selected Passenger's Details are:" + passengerDetails.getText());
		
		Thread.sleep(2000);
		
		// call Method for Decrease Values in Passenger Dropdown ....
		decrementValues(infDecValue , 1);
		decrementValues(childDecValue , 1);
		decrementValues(adultDecValue , 2);
		// Print Selected Values After decrement from Passengers Details Dropdown...
		System.out.println("Selected Passenger's Details are:" + passengerDetails.getText());
		doneBtn.click();//Click Done Button availabel in Passengers Details Dropdown...
		
				
		Thread.sleep(3000);
		driver.close();
		
	}
	// Own Method created for increment values in Passengers details dropdown...
	public static void incrementValues(WebElement ele, int j)
	{
		for (int i=1; i<=j ; i++)
		{	
				ele.click();
		}
	}
	// Own Method created for Decrement values in Passengers details dropdown...
	public static void decrementValues(WebElement ele, int j)
	{
		for (int i=1; i<=j ; i++)
		{	
				ele.click();
		}
	}

}
