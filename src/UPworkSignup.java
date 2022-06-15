import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UPworkSignup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// UPWork Sign UP Process through Automation Script.....
		System.setProperty("Webdriver.chrome.driver","chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Load UPWpork Website ....
		driver.get("https://www.upwork.com/");
		
		// Verify Sign UP Button is Displayed & Enabled too....
		System.out.println("Sign UP Button is Displayed:" + driver.findElement(By.xpath("//*[@id=\'nav-main\']/div/a[2]")).isDisplayed());
		System.out.println("Sign UP Button is Enabled:"+ driver.findElement(By.xpath("//*[@id=\'nav-main\']/div/a[2]")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\'nav-main\']/div/a[2]")).click();
		
		// Verify All Elements of SignUP Page are Displayed & Enabled too...
		
		// Check whether Continue with Google Button is Displayed & Enabled too...
		System.out.println("Continue With Google Button is Displayed:"+ driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div/div[1]/div[2]/div[1]/div[1]/button/div/span/span")).isDisplayed());
		System.out.println("Continue With Google Button is Enabled:"+ driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div/div[1]/div[2]/div[1]/div[1]/button/div/span/span")).isEnabled());
		
		// Check whether Continue with Apple Button is Displayed & Enabled too...
		System.out.println("Continue With Apple Button is Displayed:"+ driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div/div[1]/div[2]/div[2]/button/span")).isDisplayed());
		System.out.println("Continue With Apple Button is Enabled:"+ driver.findElement(By.xpath("//*[@id=\'main\']/div/div/div/div[1]/div[2]/div[2]/button/span")).isEnabled());
		
		// Check whether Email Text Box is displayed & Enabled too...
		System.out.println("Work With Email Text Box is Displayed:"+ driver.findElement(By.xpath("//input[@id=\'input-email\']")).isDisplayed());
		System.out.println("Work With Email Text Box is Enabled:"+ driver.findElement(By.xpath("//input[@id=\'input-email\']")).isEnabled());
		driver.findElement(By.xpath("//input[@id=\'input-email\']")).sendKeys("Test123@Upwork.com");
		
		// Check whether Continue with Email Button is Displayed & Enabled too...
		System.out.println("Continue With Email Button is Displayed:"+ driver.findElement(By.xpath("//Button[@id=\'button-submit-first-step\']")).isDisplayed());
		System.out.println("Continue With Email Button is Enabled:"+ driver.findElement(By.xpath("//Button[@id=\'button-submit-first-step\']")).isEnabled());
		driver.findElement(By.xpath("//Button[@id=\'button-submit-first-step\']")).click();
		Thread.sleep(3000);
		// Print Error Message When inserting Invalid Email ID....
		// Verify Error Message is Empty or not...
		String ErrMsg = driver.findElement(By.xpath("//*[@id=\'email-validation-messages\']/div/div")).getText();
		System.out.println("Status of Error Message is Empty: " + ErrMsg.isEmpty());
		System.out.println("Invalid Email Message: " + ErrMsg);
		Thread.sleep(1000);
		// Verify Want to Login? link is displayed & Enabled while we inserted invalid Email...
		System.out.println("Want to Login? Link is Displayed:"+ driver.findElement(By.xpath("//*[@id=\'email-validation-messages\']/div/div/a")).isDisplayed());
		System.out.println("Want to Login? Link is Enabled:"+ driver.findElement(By.xpath("//*[@id=\'email-validation-messages\']/div/div/a")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\'email-validation-messages\']/div/div/a")).click();
		
		// verify Want to Login? link is able to click...
		System.out.println("Want to Login? Clicked Successfully!!!");
		System.out.println("Login Page Loaded Successfully!!!");
		
		// Close Browser...
		driver.close();
		
	}

}
