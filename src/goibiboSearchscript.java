import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibiboSearchscript 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		// Goibibo Website automation script using KeyBoard Methods...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// select Values from 'FromCity' Auto suggested Drop down using Keyboard Events .... 
		WebElement fromCity = driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']"));
		fromCity.clear();
		fromCity.sendKeys("a");
		Thread.sleep(5000);
		selectValuesFromDRP(fromCity , 3);
		// Print Values From 'FromCity' Drop Down...
		System.out.println("Selected City is: " + fromCity.getAttribute("value"));
		
		// Select Values from 'ToCity' Auto Suggested Drop down using Keyboard Events ....
		WebElement toCity = driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']"));
		toCity.clear();
		toCity.sendKeys("d");
		Thread.sleep(5000);
		selectValuesFromDRP(toCity , 3);
		// Print Values From 'ToCity' Drop Down...
		System.out.println("Selected City is: " + toCity.getAttribute("value"));
		
		// Select Values from Date Picker ...
		compareTitle ("January 2022");
		Thread.sleep(1000);
		List<WebElement> dtPicker = driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div"));
		selectDate(dtPicker , "26");
		// Print values from Depart Date picker ....
		WebElement daySelect = driver.findElement(By.id("departureCalendar"));
		System.out.println("Selected date is: " + daySelect.getAttribute("value"));
		
		
		// click on Search Button ...
		WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\'gi_search_btn\']"));
		searchBtn.click();
		Thread.sleep(5000);
		
		driver.close();

	}
	public static void selectValuesFromDRP (WebElement ele , int j)
	{
		for (int i=0 ; i<j ; i++)
		{
			ele.sendKeys(Keys.ARROW_DOWN);
		}
		ele.sendKeys(Keys.ENTER);
		
	}
	public static void compareTitle (String month)
	{
		while (true)
		{
			String monthTitle = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			if (monthTitle.equalsIgnoreCase(month)) // compare title of Months available in date picker..
				break;
			else //click on Next Button available in Month Title row...
				driver.findElement(By.xpath("//div[@class='DayPicker']//span[2]")).click();
		}
	}
	public static void selectDate(List<WebElement> ele , String value)
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
