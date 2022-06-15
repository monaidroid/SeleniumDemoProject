import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGBARGraphAutomation 
{

	public static void main(String[] args) 
	{
		// BAR Graph using SVG tag - Automation Script...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		String barXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		String barTooltipsXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		List<WebElement> barLists = driver.findElements(By.xpath(barXpath));
		System.out.println("Total Nos of Bars are: " + barLists.size());
		
		// call Action class to pass driver....
		Actions act = new Actions(driver);
		for (WebElement bar:barLists)
		{
			act.moveToElement(bar).perform();
			String barTooltip = driver.findElement(By.xpath(barTooltipsXpath)).getText();
			System.out.println(barTooltip);
		}
		driver.close();
		
		
	}

}
