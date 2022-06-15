

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloudMiracle_cmpList 
{
	
	public static void main(String[] args) 
	{
		// Search Company from Company List
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.15.211:8081/");
		WebDriverWait wait = new WebDriverWait(driver,50);
			
		WebElement uName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserName")));
		System.out.println("Login ID Text field is Displayed: " + uName.isDisplayed());
		uName.sendKeys("sangeeta");
			
		WebElement uPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
		System.out.println("Password Text field is Displayed: " + uPwd.isDisplayed());
		uPwd.sendKeys("123");
			
		WebElement btnSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmit")));
		System.out.println("Sign In Button is Displayed: " + btnSubmit.isDisplayed());
		btnSubmit.click();
		System.out.println("*****You have Login Successfully*****");
		
		// Open Company from Company List
		String before_Xpath = "//tbody[contains(@role,'presentation')]//tr[@aria-rowindex='";
		String after_Xpath = "']//td[2]";
		String cmpValue = "Template Testing";
		for (int i=1; i<=10; i++)
		{
			WebElement cmpList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(before_Xpath +i+ after_Xpath)));
			//System.out.println("Selected Company Name is: "+ cmpList.getText());
			if (cmpList.getText().contains(cmpValue))
			{
				cmpList.click();
				cmpList.sendKeys(Keys.ENTER);
				System.out.println("Selected Company Name is: "+ cmpList.getText());
				break;
			}
		}
		/*
		// Go back to Company List
		WebElement cmpListopn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='currentCmp']")));
		cmpListopn.sendKeys(Keys.ENTER);
		*/
	}
}
