import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OwnMethodForMultipleDRP 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// Select Values by Calling our own Method from Multiple DropDown...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Select Value From Country Drop down.....
		WebElement autoDrp = driver.findElement(By.id("autosuggest"));
		autoDrp.sendKeys("IN");
		Thread.sleep(3000);
		List<WebElement> autoDropDown = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		selectVlauesFromDRP(autoDropDown,"India");
		
		// Select Value From Departure City Drop down.....
		WebElement departureDRP = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		departureDRP.click();
		List<WebElement> departureList = driver.findElements(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"]//a"));
		selectVlauesFromDRP(departureList,"Jaipur (JAI)");
		
		// Select Value From Arrival City Drop down.....
		WebElement arrivalDRP = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		arrivalDRP.click();
		List<WebElement> arrivalList = driver.findElements(By.xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a"));
		selectVlauesFromDRP(arrivalList,"Goa (GOI)");
		
		// Select Value From Depart Date Picker...
		WebElement departDate = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		departDate.click(); // Open depart date Picker
		Thread.sleep(1000);
		compareTitle("January", "2022"); //Call compare Method..
		List<WebElement> dtList = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//td"));
		selectVlauesFromDRP(dtList,"8"); // call select values from Drop downs method...
		// Print Selected Date ..
		WebElement selectedDate = driver.findElement(By.xpath("//*[@id=\'view_fulldate_id_1\']"));
		System.out.println("Selected Date is: " + selectedDate.getText());
		Thread.sleep(2000);
		// Select values from Passengers Detail Drop Down....
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
		Thread.sleep(1000);
		// Print Default Passengers Details from Passenger Drop down....
		System.out.println("Default Passenger's Details are: " + passengerDetails.getText());
		
		// Call Method for Increase Values in Passenger Drop down ....
		incrementValues(infIncValue , 3);
		incrementValues(childIncValue , 3);
		incrementValues(adultIncValue , 5);
		// Print Selected Values After Increment from Passengers Details Drop down...
		System.out.println("After Incrementing in Passenger's Details are: " + passengerDetails.getText());
		Thread.sleep(2000);
		
		// call Method for Decrease Values in Passenger Drop down ....
		decrementValues(infDecValue , 1);
		decrementValues(childDecValue , 1);
		decrementValues(adultDecValue , 2);
		// Print Selected Values After decrement from Passengers Details Drop down...
		System.out.println("After Decrementing in Passenger's Details are: " + passengerDetails.getText());
		doneBtn.click(); //Click Done Button available in Passengers Details Drop down...
		Thread.sleep(1000);
		// Click on Search Button...
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']"));
		searchBtn.click();
		
		
		Thread.sleep(8000);
		driver.close();
		
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
	// Own Method Creating for Comparing value of given month with month available in Header of Date Picker.....
	public static void compareTitle(String month , String year)
	{
		while (true)
		{
			String monthTitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span")).getText();
			String yearTitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[2]")).getText();
			System.out.println("Current Month Title is: " + monthTitle);
			if (monthTitle.equalsIgnoreCase(month) && yearTitle.equals(year)) // compare title of Months available in date picker..
				break;
			else //click on Next Button available in Month Title row...
				driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//div//a//span")).click();
		}
	}
	// Own Method created for increment values in Passengers details drop down...
	public static void incrementValues(WebElement ele, int j)
	{
		for (int i=1; i<=j ; i++)
		{	
				ele.click();
		}
	}
	// Own Method created for Decrement values in Passengers details drop down...
	public static void decrementValues(WebElement ele, int j)
	{
		for (int i=1; i<=j ; i++)
		{	
				ele.click();
		}
	}
}
