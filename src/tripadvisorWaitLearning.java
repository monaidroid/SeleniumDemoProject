import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tripadvisorWaitLearning 
{

	public static void main(String[] args) 
	{
		// Implicitlywait learning....
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder = 'Where to?']"));
		
		searchBox.sendKeys("venice");
		searchBox.sendKeys(Keys.ENTER);
		
		WebElement searchText= driver.findElement(By.xpath("(//div[@class='location-meta-block'])[1]//div//span"));
		System.out.println("My Search Text is:" + searchText.getText());
		searchText.click();
		
		//WebElement searchRslt = driver.findElement(By.xpath("//div[@class='search-results-list']"));
		
		driver.close();

	}

}
