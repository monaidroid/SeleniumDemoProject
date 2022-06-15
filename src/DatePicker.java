import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker 
{
	 
	public static void main(String[] args) throws InterruptedException 
	{
		// Select Values From Date Picker.....
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		// Open Website in chrome browser....
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		// Click on Date picker to open it...
		WebElement fromDt = driver.findElement(By.xpath("//*[@id=\'flightSearchContainer\']//div[4]//button"));
		fromDt.click(); 
		Thread.sleep(3000);
		
		List<WebElement> datepkr = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div//table//td"));
		//System.out.println(datepkr.size());
		String year = "2021";
		String month = "October";
		String date = "28";
		while (true)
		{
			String fMonthTitle = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//div[1]//div//div//span[1]")).getText();
			String fYearTitle = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//div[1]//div//div//span[2]")).getText();
			System.out.println("Current Month Title is: " + fMonthTitle);
			if (fYearTitle.equals(year) && fMonthTitle.equalsIgnoreCase(month))
				break;
			else
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']//div[2]//div//a")).click();	
		}
		
		// select Date From the Date Picker...	
		List<WebElement> alldates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']//table//td"));
		for (WebElement dates:alldates)
		{
			String dt = dates.getText();
			if (dt.equals(date))
			{
					dates.click();
					break;
			}
		}
		
		WebElement departDate=driver.findElement(By.xpath("//*[@id=\'view_fulldate_id_1\']"));
		System.out.println("Selected Depart Date is: " + departDate.getText());
		Thread.sleep(3000);
		driver.close();
	}
	
}



