import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sampleExplicitywait 
{

	public static void main(String[] args) 
	{
		// Explicitwait learning....
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		WebElement searchBox;
		searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder = 'Where to?']")));
		searchBox.sendKeys("venice");
		searchBox.sendKeys(Keys.ENTER);
		
		//List<WebElement> searchRsltList = driver.findElements(By.xpath("//div[@class='result-title']"));
		WebElement searchText= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='location-meta-block'])[1]//div//span")));
		System.out.println("My Search Text is:" + searchText.getText());
		searchText.click();
		
		/*
		String str = searchText.getText();
		for (WebElement searchRslt:searchRsltList)
		{
			if (searchRslt.getText().equals(str)) //match given search text with available search result
			{
				System.out.println(searchRslt.getText());
				searchRslt.click();
				break;
			}
			else
			{
				System.out.println("No Result Found!!!");
				break;
			}
		}
		*/
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='_28ADz3YM']")));
		//driver.close();
	}

}
