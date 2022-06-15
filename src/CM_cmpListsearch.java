import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CM_cmpListsearch 
{
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) 
	{
		// Search Company from Company List..
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		// open URL in maximize view in Chrome Browser ..
		driver.get("https://cloud.rkitsoftware.com/");
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 60);
		
		// Login script..
		// Add User Name & Password values
		WebElement uName = driver.findElement(By.id("txtUserName"));
		WebElement uPwd = driver.findElement(By.id("txtPassword"));
		sendValues(driver, uName, 10, "sd");
		sendValues(driver, uPwd, 5, "sd");

		// click on Submit Button
		WebElement btnSubmit = driver.findElement(By.id("btnSubmit"));
		clickElement(driver, btnSubmit, 10);
		System.out.println("*** Company List Opened Successfully ***");
		
		// Company List
		//WebElement cmpList = driver.findElement(By.xpath("//div[contains(@class,'dx-datagrid-rowsview')]"));
		//List<WebElement> cmpList = driver.findElements(By.xpath("//div[contains(@class,'dx-datagrid-rowsview')]//table//tr"));
		//wait.until(ExpectedConditions.visibilityOfAllElements(cmpList));
		//System.out.println(cmpList.size());
		
		By elelocator = By.xpath("//div[contains(@class,'dx-datagrid-rowsview')]//table//tr");
		//By.xpath("(//table[contains(@class,'dx-datagrid-table')])[2]");		
		//String before_Xpath = "//tbody[contains(@role,'presentation')]//tr[@aria-rowindex='";
		//String after_Xpath = "']//td[2]";
		//String cmpValue = "Stock Journal Auto-Test";
		//searchValue(driver, cmpList, before_Xpath, after_Xpath, cmpValue);
		System.out.println(searchValue(driver, elelocator,10).size());
		
		
	}
	// send values in text fields
	public static void sendValues(WebDriver driver, WebElement element, int duration, String value)
	{
		// Explicit Wait call...
		new WebDriverWait(driver, duration)
		.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	// click on Buttons
	public static void clickElement(WebDriver driver, WebElement element, int duration)
	{
		// Explicit Wait call...
		new WebDriverWait(driver, duration)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static List<WebElement> searchValue (WebDriver driver, By locator, int duration)
	{
		// Explicit Wait call...
		new WebDriverWait(driver, duration)
		.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		return driver.findElements(locator);
	}
		

}
