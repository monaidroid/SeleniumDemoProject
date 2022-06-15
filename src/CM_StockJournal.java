import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CM_StockJournal 
{

	public static void main(String[] args) 
	{
		// Stock Journal Voucher Entry Script...
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cloud.rkitsoftware.com/");
		driver.manage().window().maximize();
		
		// Explicit Wait using...
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		// Login Script..
		WebElement uName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserName")));
		System.out.println("Login ID Text field is Displayed: " + uName.isDisplayed());
		uName.sendKeys("sd");
				
		WebElement uPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
		System.out.println("Password Text field is Displayed: " + uPwd.isDisplayed());
		uPwd.sendKeys("sd");
				
		WebElement btnSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmit")));
		System.out.println("Sign In Button is Displayed: " + btnSubmit.isDisplayed());
		btnSubmit.click();
		
		// Company creation
		// Add New Company by clicking on Add Button
		WebElement AddDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Add']")));
		System.out.println("Add button is displayed: " + AddDisplay.isDisplayed());
		AddDisplay.click();
		
		// **** Add New Company ****
		
		// Add Company Number
		WebElement cmpNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@aria-valuemin,'1')]")));
		System.out.println("Company Number is displayed: " + cmpNo.isDisplayed());
		cmpNo.click();
		cmpNo.clear();
		cmpNo.sendKeys("1111");
		//cmpNo.sendKeys(Keys.NUMPAD1);
		cmpNo.sendKeys(Keys.TAB);
				
		// Add Company Name
		WebElement cmpName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtNm')]//div//div//input")));
		System.out.println("Company Name is displayed: " + cmpName.isDisplayed());
		cmpName.sendKeys("Stock Journal Auto-Test");
		cmpName.sendKeys(Keys.TAB);
				
		// Add Short Name 
		WebElement cmpShortNM = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtShortNm')]//div//div//input")));
		System.out.println("Company Short Name is displayed: " + cmpShortNM.isDisplayed());
		cmpShortNM.sendKeys("SJ");
		cmpShortNM.sendKeys(Keys.TAB);
				
		// Select Group Name
		WebElement cmpGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'gridContainer')]//div//div//div//div//div//div//table//tbody//tr//td")));
		System.out.println("Company Group is displayed: " + cmpGroup.isDisplayed());
		//cmpGroup.sendKeys(Keys.ARROW_DOWN);
		cmpGroup.sendKeys(Keys.TAB);
				
		// Add Report Description
		WebElement cmpRHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtRHeader')]//div//div//input")));
		System.out.println("Company Report Header is displayed: " + cmpRHeader.isDisplayed());
		cmpRHeader.sendKeys(Keys.TAB);
		cmpRHeader.sendKeys(Keys.TAB);
				
		// Add Juridiction City
		WebElement cmpJCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtJCity')]//div//div//input")));
		System.out.println("Company Juridiction City is displayed: " + cmpJCity.isDisplayed());
		cmpJCity.sendKeys(Keys.TAB);
				
		// Click on Next Button
		WebElement FnextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'nextBtn')]")));
		System.out.println("Next Button is Displayed: " + FnextBtn.isDisplayed());
		FnextBtn.click();
		System.out.println("*** Statutory Details opened successfully ***");
				
		// Add PAN No 
		WebElement cmpPANNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtPANNo')]//div//div//input")));
		System.out.println("Company PAN Number is displayed: " + cmpPANNo.isDisplayed());
		cmpPANNo.sendKeys("AAARA1234R");
		cmpPANNo.sendKeys(Keys.TAB);
				
		// Add GSTIN No
		WebElement cmpGSTINNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtGSTINNo')]//div//div//input")));
		System.out.println("Company GSTIN Number is displayed: " + cmpGSTINNo.isDisplayed());
		cmpGSTINNo.sendKeys("24AAARA1234R1JZ");
		cmpGSTINNo.sendKeys(Keys.TAB);
				
		// GST Registration Date
		WebElement cmpGSTRegDt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'GSTRegDt')]//div//div//input")));
		System.out.println("Company GST Registration Date is displayed: " + cmpGSTRegDt.isDisplayed());
		cmpGSTRegDt.sendKeys(Keys.TAB);
				
		// Add AdharNo
		WebElement cmpAdharNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtAadharNo')]//div//div//input")));
		System.out.println("Company Adhar Number is displayed: " + cmpAdharNo.isDisplayed());
		cmpAdharNo.sendKeys("123456789012");
		cmpAdharNo.sendKeys(Keys.TAB);
				
		// Add Company SSI No
		WebElement cmpSSINo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtCmpSSINo')]//div//div//input")));
		System.out.println("Company SSI No is displayed: " + cmpSSINo.isDisplayed());
		cmpSSINo.sendKeys(Keys.TAB);
				
		// Add LIC No
		WebElement cmpLICNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtGeneralLICNo')]//div//div//input")));
		System.out.println("Company LIC No is displayed: " + cmpLICNo.isDisplayed());
		cmpLICNo.sendKeys(Keys.TAB);
				
		// Add Wholesale LIC No
		WebElement cmpWhLICNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtWholeSaleLICNo')]//div//div//input")));
		System.out.println("Company Wholesale LIC No is displayed: " + cmpWhLICNo.isDisplayed());
		cmpWhLICNo.sendKeys(Keys.TAB);
				
		// Add Commission Agent LIC No
		WebElement cmpCALICNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtCALICNo')]//div//div//input")));
		System.out.println("Company Commission Agent LIC No is displayed: " + cmpCALICNo.isDisplayed());
		cmpCALICNo.sendKeys(Keys.TAB);
				
		// Add Drug LIC No
		WebElement cmpDgLICNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtDrugLICNo')]//div//div//input")));
		System.out.println("Company Drug LIC is displayed: " + cmpDgLICNo.isDisplayed());
		cmpDgLICNo.sendKeys(Keys.TAB);
				
		// Add Food Product LIC No
		WebElement cmpFPLICNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtFPLICNo')]//div//div//input")));
		System.out.println("Company Food Product LIC is displayed: " + cmpFPLICNo.isDisplayed());
		cmpFPLICNo.sendKeys(Keys.TAB);
				
		// Click on Next Button
		WebElement SnextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'nextBtn')]")));
		//System.out.println("Next Button is Displayed: " + SnextBtn.isDisplayed());
		SnextBtn.click();
		System.out.println("*** Address Details opened successfully ***");

		// Add Address Details
		WebElement cmpAddFL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtAdd1')]//div//div//input")));
		System.out.println("Company Address1 is displayed: " + cmpAddFL.isDisplayed());
		cmpAddFL.sendKeys("CMP ADD1");
		cmpAddFL.sendKeys(Keys.TAB);
		WebElement cmpAddSL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtAdd2')]//div//div//input")));
		System.out.println("Company Address2 is displayed: " + cmpAddSL.isDisplayed());
		cmpAddSL.sendKeys("CMP ADD2");
		cmpAddSL.sendKeys(Keys.TAB);
		WebElement cmpAddTL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtAdd3')]//div//div//input")));
		System.out.println("Company Address3 is displayed: " + cmpAddTL.isDisplayed());
		cmpAddTL.sendKeys("CMP ADD3");
		cmpAddTL.sendKeys(Keys.TAB);
				
		// Add City Details
		WebElement cmpCity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtCity')]//div//div//input")));
		System.out.println("Company City is displayed: " + cmpCity.isDisplayed());
		cmpCity.sendKeys("CMP CITY");
		cmpCity.sendKeys(Keys.TAB);
				
		// Add PINCODE Details
		WebElement cmpPIN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtPincode')]//div//div//input")));
		System.out.println("Company PINCODE is displayed: " + cmpPIN.isDisplayed());
		cmpPIN.sendKeys("123456");
		cmpPIN.sendKeys(Keys.TAB);
				
		// Add State Name
		WebElement cmpState = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtState')]//div//div//input")));
		System.out.println("Company State Name is displayed: " + cmpState.isDisplayed());
		cmpState.sendKeys("Gujarat");
		cmpState.sendKeys(Keys.TAB);
				
		// Add Country Name
		WebElement cmpCountry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtContry')]//div//div//input")));
		System.out.println("Company Country detail is displayed: " + cmpCountry.isDisplayed());
		cmpCountry.sendKeys("INDIA");
		cmpCountry.sendKeys(Keys.TAB);
				
		// Add Phone Number
		WebElement cmpPHNoFL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtPhNo1')]//div//div//input")));
		System.out.println("Company Phone No1 is displayed: " + cmpPHNoFL.isDisplayed());
		cmpPHNoFL.sendKeys(Keys.TAB);
		WebElement cmpPHNoSL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtPhNo2')]//div//div//input")));
		System.out.println("Company Phone No2 is displayed: " + cmpPHNoSL.isDisplayed());
		cmpPHNoSL.sendKeys(Keys.TAB);
				
		// Add Mobile Number
		WebElement cmpMobNoFL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtMobileNo1')]//div//div//input")));
		System.out.println("Company Mobile No1 is displayed: " + cmpMobNoFL.isDisplayed());
		cmpMobNoFL.sendKeys("9876543210");
		cmpMobNoFL.sendKeys(Keys.TAB);
		WebElement cmpMobNoSL = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtMobileNo2')]//div//div//input")));
		System.out.println("Company Mobile No2 is displayed: " + cmpMobNoSL.isDisplayed());
		cmpMobNoSL.sendKeys(Keys.TAB);
				
		// Add Email Detail
		WebElement cmpEMail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtEmail')]//div//div//input")));
		System.out.println("Company Email is displayed: " + cmpEMail.isDisplayed());
		cmpEMail.sendKeys("Test123@gmail.com");
		cmpEMail.sendKeys(Keys.TAB);
				
		// Add Website Detail
		WebElement cmpWeb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtWeb')]//div//div//input")));
		System.out.println("Company Website detail is displayed: " + cmpWeb.isDisplayed());
		cmpWeb.sendKeys("www.Test123.com");
		cmpWeb.sendKeys(Keys.TAB);
				
		// Click on Next Button
		WebElement TnextBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'nextBtn')]")));
		//System.out.println("Next Button is Displayed: " + SnextBtn.isDisplayed());
		TnextBtn.click();
		System.out.println("*** Bank Details opened successfully ***");
		
		// Add Bank Name
		WebElement cmpBKName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtBnkNm')]//div//div//input")));
		System.out.println("Company Bank Name is displayed: " + cmpBKName.isDisplayed());
		cmpBKName.sendKeys("BOB");
		cmpBKName.sendKeys(Keys.TAB);
				
		// Add Branch Name
		WebElement cmpBRName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtBranchNm')]//div//div//input")));
		System.out.println("Company Branch Name is displayed: " + cmpBRName.isDisplayed());
		cmpBRName.sendKeys("BOB CMPCITY BRANCH");
		cmpBRName.sendKeys(Keys.TAB);
				
		// Add Bank Address detail
		WebElement cmpBKAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtBAdd')]//div//div//input")));
		System.out.println("Company Bank Address is displayed: " + cmpBKAdd.isDisplayed());
		cmpBKAdd.sendKeys("BOB ADD");
		cmpBKAdd.sendKeys(Keys.TAB);
				
		// Add Bank IFSC code detail
		WebElement cmpBKIFSC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtIFSCCode')]//div//div//input")));
		System.out.println("Company IFSC Code is displayed: " + cmpBKIFSC.isDisplayed());
		cmpBKIFSC.sendKeys(Keys.TAB);
				
		// Add Bank Account Number detail
		WebElement cmpBKAcc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtAccNo')]//div//div//input")));
		System.out.println("Company Account Number is displayed: " + cmpBKAcc.isDisplayed());
		cmpBKAcc.sendKeys(Keys.TAB);
				
		// Add Bank UPI Code detail
		WebElement cmpBKUPI = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtUPICode')]//div//div//input")));
		System.out.println("Company UPI Code is displayed: " + cmpBKUPI.isDisplayed());
		cmpBKUPI.sendKeys(Keys.TAB);
				
		// Click on Finish Button
		WebElement finishBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'submitBtn')]")));
		System.out.println("Finish Button is Displayed: " + finishBtn.isDisplayed());
		finishBtn.click();
		System.out.println("*** Company created successfully ***");
				
	}

}
