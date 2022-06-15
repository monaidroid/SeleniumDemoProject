import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CM_Login 
{
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args) 
	{
		// Login Script & Creating New Company Script by using Own created methods ...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
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
		
		// Add New Company
		//WebElement AddDisplay = driver.findElement(By.xpath("(//*[text()='Add'])[1]"));
		WebElement AddDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Add'])[1]")));
		clickElement(driver, AddDisplay, 5); // Add Button Clicked...
		System.out.println("*** Company Details Window Opened Successfully ***");
		
		// Add New Company Details
		//WebElement cmpNo = driver.findElement(By.xpath("//input[contains(@aria-valuemin,'1')]"));
		WebElement cmpNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@aria-valuemin,'1')]")));
		WebElement cmpName = driver.findElement(By.xpath("//*[contains(@id,'txtNm')]//div//div//input"));
		WebElement cmpShortNM = driver.findElement(By.xpath("//*[contains(@id,'txtShortNm')]//div//div//input"));
		WebElement cmpGroup = driver.findElement(By.xpath("//*[contains(@id,'txtGrpNm')]//div//div//input"));
		WebElement cmpRHeader = driver.findElement(By.xpath("//*[contains(@id,'txtRHeader1')]//div//div//input"));
		WebElement cmprHeader = driver.findElement(By.xpath("//*[contains(@id,'txtRHeader2')]//div//div//input"));
		WebElement cmpJCity = driver.findElement(By.xpath("//*[contains(@id,'txtJCity')]//div//div//input"));
		WebElement btnNext = driver.findElement(By.xpath("//*[contains(@id,'nextBtn')]"));
		
		// Add Statutory Details ...
		WebElement cmpPANNo = driver.findElement(By.xpath("//*[contains(@id,'txtPANNo')]//div//div//input"));
		WebElement cmpGSTINNo = driver.findElement(By.xpath("//*[contains(@id,'txtGSTINNo')]//div//div//input"));
		WebElement cmpGSTRegDt = driver.findElement(By.xpath("//*[contains(@id,'GSTRegDt')]//div//div//input"));
		WebElement cmpAdharNo = driver.findElement(By.xpath("//*[contains(@id,'txtAadharNo')]//div//div//input"));
		WebElement cmpSSINo = driver.findElement(By.xpath("//*[contains(@id,'txtCmpSSINo')]//div//div//input"));
		WebElement cmpLICNo = driver.findElement(By.xpath("//*[contains(@id,'txtGeneralLICNo')]//div//div//input"));
		WebElement cmpWhLICNo = driver.findElement(By.xpath("//*[contains(@id,'txtWholeSaleLICNo')]//div//div//input"));
		WebElement cmpCALICNo = driver.findElement(By.xpath("//*[contains(@id,'txtCALICNo')]//div//div//input"));
		WebElement cmpDgLICNo = driver.findElement(By.xpath("//*[contains(@id,'txtDrugLICNo')]//div//div//input"));
		WebElement cmpFPLICNo = driver.findElement(By.xpath("//*[contains(@id,'txtFPLICNo')]//div//div//input"));
		
		// Add Address Details
		WebElement cmpAddFL = driver.findElement(By.xpath("//*[contains(@id,'txtAdd1')]//div//div//input"));
		WebElement cmpAddSL = driver.findElement(By.xpath("//*[contains(@id,'txtAdd2')]//div//div//input"));
		WebElement cmpAddTL = driver.findElement(By.xpath("//*[contains(@id,'txtAdd3')]//div//div//input"));
		WebElement cmpCity = driver.findElement(By.xpath("//*[contains(@id,'txtCity')]//div//div//input"));
		WebElement cmpPIN = driver.findElement(By.xpath("//*[contains(@id,'txtPincode')]//div//div//input"));
		WebElement cmpState = driver.findElement(By.xpath("//*[contains(@id,'txtState')]//div//div//input"));
		WebElement cmpCountry = driver.findElement(By.xpath("//*[contains(@id,'txtContry')]//div//div//input"));
		WebElement cmpPHNoFL = driver.findElement(By.xpath("//*[contains(@id,'txtPhNo1')]//div//div//input"));
		WebElement cmpPHNoSL = driver.findElement(By.xpath("//*[contains(@id,'txtPhNo2')]//div//div//input"));
		WebElement cmpMobNoFL = driver.findElement(By.xpath("//*[contains(@id,'txtMobileNo1')]//div//div//input"));
		WebElement cmpMobNoSL = driver.findElement(By.xpath("//*[contains(@id,'txtMobileNo2')]//div//div//input"));
		WebElement cmpEMail = driver.findElement(By.xpath("//*[contains(@id,'txtEmail')]//div//div//input"));
		WebElement cmpWeb = driver.findElement(By.xpath("//*[contains(@id,'txtWeb')]//div//div//input"));
		
		// Add Bank Details
		WebElement cmpBKName = driver.findElement(By.xpath("//*[contains(@id,'txtBnkNm')]//div//div//input"));
		WebElement cmpBRName = driver.findElement(By.xpath("//*[contains(@id,'txtBranchNm')]//div//div//input"));
		WebElement cmpBKAdd = driver.findElement(By.xpath("//*[contains(@id,'txtBAdd')]//div//div//input"));
		WebElement cmpBKIFSC = driver.findElement(By.xpath("//*[contains(@id,'txtIFSCCode')]//div//div//input"));
		WebElement cmpBKAcc = driver.findElement(By.xpath("//*[contains(@id,'txtAccNo')]//div//div//input"));
		WebElement cmpBKUPI = driver.findElement(By.xpath("//*[contains(@id,'txtUPICode')]//div//div//input"));
		// Submit Button
		WebElement finishBtn = driver.findElement(By.xpath("//*[contains(@id,'submitBtn')]"));
		
		cmpNo.clear();
		sendValues(driver, cmpNo, 10, "111");
		sendValues(driver, cmpName, 3, "Test111");
		sendValues(driver, cmpShortNM, 3, "T111");
		cmpGroup.sendKeys(Keys.TAB);
		sendValues(driver, cmpRHeader, 3, " ");
		sendValues(driver, cmprHeader, 3, " ");
		sendValues(driver, cmpJCity, 3, " ");
		clickElement(driver, btnNext, 5);
		System.out.println("*** Statutory Details opened successfully ***");
		sendValues(driver, cmpPANNo, 5, "AAARA1234S");
		sendValues(driver, cmpGSTINNo, 3, "24AAARA1234S1JZ");
		cmpGSTRegDt.sendKeys(Keys.TAB);
		sendValues(driver, cmpAdharNo, 3, " ");
		sendValues(driver, cmpSSINo, 3, " ");
		sendValues(driver, cmpLICNo, 3, " ");
		sendValues(driver, cmpWhLICNo, 3, " ");
		sendValues(driver, cmpCALICNo, 3, " ");
		sendValues(driver, cmpDgLICNo, 3, " ");
		sendValues(driver, cmpFPLICNo, 3, " ");
		clickElement(driver, btnNext, 5);
		System.out.println("*** Address Details opened successfully ***");
		sendValues(driver, cmpAddFL, 5, "CMP ADD1");
		sendValues(driver, cmpAddSL, 3, "CMP ADD2");
		sendValues(driver, cmpAddTL, 3, "CMP ADD3");
		sendValues(driver, cmpCity, 3, "CMP CITY");
		sendValues(driver, cmpPIN, 3, "123456");
		sendValues(driver, cmpState, 3, "Gujarat");
		sendValues(driver, cmpCountry, 3, "INDIA");
		sendValues(driver, cmpPHNoFL, 3, " ");
		sendValues(driver, cmpPHNoSL, 3, " ");
		sendValues(driver, cmpMobNoFL, 3, "9876543210");
		sendValues(driver, cmpMobNoSL, 3, " ");
		sendValues(driver, cmpEMail, 3, "Test12@gmail.com");
		sendValues(driver, cmpWeb, 3, "www.Test12.com");
		clickElement(driver, btnNext, 5);
		System.out.println("*** Bank Details opened successfully ***");
		sendValues(driver, cmpBKName, 5, "BOB");
		sendValues(driver, cmpBRName, 3, "BOB CMPCITY BRANCH");
		sendValues(driver, cmpBKAdd, 3, "BOB ADD");
		sendValues(driver, cmpBKIFSC, 3, " ");
		sendValues(driver, cmpBKAcc, 3, " ");
		sendValues(driver, cmpBKUPI, 3, " ");
		clickElement(driver, finishBtn, 5);
		System.out.println("*** Company created successfully ***");
		
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
	

}
