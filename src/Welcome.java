import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome {

	public static void main(String[] args) {
		
		// System.out.println("Welcome To Selenium World...!!!");

		// WebDriver setup by using SetProperty..
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println("My Title is:-" + driver.getTitle());
		System.out.println("My Current URL is:-" + driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		
		driver.get("http://www.yahoo.com/");
		System.out.println("My Title is:-" + driver.getTitle());
		System.out.println("My Current URL is:-" + driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println("....Navigate Back Process Done....");
		System.out.println("My Title is:-" + driver.getTitle());
		System.out.println("My Current URL is:-" + driver.getCurrentUrl());
		
		driver.close();
		
	}

}
