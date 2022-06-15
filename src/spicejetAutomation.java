import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejetAutomation 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// SpiceJet.com Automation script... 
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		// open Spicejet.com website & maximize browser window...
		driver.get("https://www.spicejet.com/");
		//driver.get("https://beta.spicejet.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
				
		// Select Value From Departure City Drop down.....
		WebElement departureDRP = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		departureDRP.click();
		
		List<WebElement> departureList = driver.findElements(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTNR\"]//a"));
		selectVlauesFromDRP(departureList,"Jaipur (JAI)");
		Thread.sleep(1000);
		// Select Value From Arrival City Drop down.....
		List<WebElement> arrivalList = driver.findElements(By.xpath("//*[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a"));
		selectVlauesFromDRP(arrivalList,"Goa (GOI)");
		Thread.sleep(1000);
		
		// Select Value From Depart Date Picker...
		//WebElement departDate = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		//departDate.click(); // Open depart date Picker
		compareTitle("January", "2022"); //Call compare Method..
		List<WebElement> dtList = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[1]//table//td"));
		selectVlauesFromDRP(dtList,"15"); // call select values from Drop downs method...
		// Print Selected Date ..
		WebElement selectedDate = driver.findElement(By.xpath("//*[@id=\'view_fulldate_id_1\']"));
		System.out.println("Selected Date is: " + selectedDate.getText());
		Thread.sleep(5000);
		
		// Select values from Passengers Detail Drop Down....
		WebElement passengerDRP = driver.findElement(By.id("divpaxinfo"));
		passengerDRP.click();
		
		WebElement adultDrp = driver.findElement(By.xpath("//div[@id='divpaxOptions']//p[1]"));
		adultDrp.click();
		WebElement adultList = driver.findElement(By.xpath("//div[@id='divpaxOptions']//div[2]//p[1]//select"));
		passengerVlauesFromDRP(adultList , "5");
		Thread.sleep(1000);
		
		WebElement childDrp = driver.findElement(By.xpath("//div[@id='divpaxOptions']//p[2]"));
		childDrp.click();
		Thread.sleep(1000);
		WebElement childList = driver.findElement(By.xpath("//div[@id='divpaxOptions']//div[2]//p[2]//select"));
		passengerVlauesFromDRP(childList , "3");
		Thread.sleep(1000);
		
		WebElement infantDrp = driver.findElement(By.xpath("//div[@id='divpaxOptions']//p[3]"));
		infantDrp.click();
		Thread.sleep(1000);
		WebElement infantList = driver.findElement(By.xpath("//div[@id='divpaxOptions']//div[2]//p[3]//select"));
		passengerVlauesFromDRP(infantList , "1");
		Thread.sleep(1000);
		
		passengerDRP.click();
		System.out.println("Selected Passenger Details are: " + passengerDRP.getText());
		
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
			String monthTitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[1]")).getText();
			String yearTitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[2]")).getText();
			System.out.println("Month & Year Title is: " + monthTitle + yearTitle);
			if (monthTitle.equalsIgnoreCase(month) && yearTitle.equals(year)) // compare title of Months available in date picker..
				break;
			else //click on Next Button available in Month Title row...
				driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//div//a//span")).click();
		}
	}
	public static void passengerVlauesFromDRP(WebElement ele, String value)
	{
		
		Select passengerOptions = new Select(ele);
		List<WebElement> optionList = passengerOptions.getOptions();
		for (WebElement option:optionList)
		{
			if (option.getText().equals(value))
			{
				//System.out.println("Selected Values From Dropdown is: " + option.getText());
				option.click();
				break;
			}
		}
	}

}
