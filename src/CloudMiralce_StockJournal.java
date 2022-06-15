import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloudMiralce_StockJournal 
{

	public static void main(String[] args) 
	{
		// search Company from company List Test script...
		// Stock Journal Script..
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://192.168.15.211:8081/");
		driver.get("https://cloud.rkitsoftware.com/");
		driver.manage().window().maximize();
		
		// Explicit Wait using...
		WebDriverWait wait = new WebDriverWait(driver,70);
		
		// Login Script..
		WebElement uName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserName")));
		System.out.println("Login ID Text field is Displayed: " + uName.isDisplayed());
		//uName.sendKeys("sangeeta");
		uName.sendKeys("sd");
		
		WebElement uPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
		System.out.println("Password Text field is Displayed: " + uPwd.isDisplayed());
		//uPwd.sendKeys("123");
		uPwd.sendKeys("sd");
		
		WebElement btnSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmit")));
		System.out.println("Sign In Button is Displayed: " + btnSubmit.isDisplayed());
		btnSubmit.click();
		System.out.println("*****You have Login Successfully*****");
		
		// Open Company from Company List
		////tbody[contains(@role,'presentation')]//tr[@aria-rowindex=7]//td[2]
		String before_Xpath = "//tbody[contains(@role,'presentation')]//tr[@aria-rowindex='";
		String after_Xpath = "']//td[2]";
		String cmpValue = "Stock Journal Auto-Test";
		for (int i=1; i<=10; i++)
		{
			WebElement cmpList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(before_Xpath +i+ after_Xpath)));
			if (cmpList.getText().contains(cmpValue))
			{
				cmpList.click();
				cmpList.sendKeys(Keys.ENTER);
				System.out.println("Selected Company Name is: "+ cmpList.getText());
				break;
			}
		}
		// Select Primary Unit ...
		WebElement pUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@aria-selected='false'][contains(.,'Primary Unit')]")));
		pUnit.sendKeys(Keys.ENTER);
		
		//Select Primary Branch ...
		WebElement pBranch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@aria-selected='false'][contains(.,'Primary Branch')]")));
		pBranch.sendKeys(Keys.ENTER);
		
		// Click on OK Button available in Branch window..
		WebElement btnOK = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'btnOk')]//div//span")));
		btnOK.click();
		System.out.println("OK Button clicked...");
		
		// Stock Journal Test script..
		
		// click Header Menu
		//WebElement tHeaderMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='headerMenu']//div//ul//li[3]//div//div")));
		WebElement tHeaderMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'dx-menu-item-popout')])[3]")));
		tHeaderMenu.click();
		System.out.println("***PopUp Opened successfully***");	
		
		/*
		WebElement stJournal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Stock Journal')]")));
		stJournal.click();
		System.out.println("Stock Journal Entry opened");
		*/
		
		//List<WebElement> stJournal = driver.findElements(By.xpath("//*[contains(@class,'context-menu')]//div[1]//ul//li"));
		List<WebElement> stJournal = driver.findElements(By.xpath("(//div[@class='dx-submenu'])[1]//ul//li"));
		wait.until(ExpectedConditions.visibilityOfAllElements(stJournal));
		System.out.println(stJournal.size());
		String value = "Stock Journal";
		for (WebElement option:stJournal)
		{
			if (option.getText().equals(value))
			{
				System.out.println("Selected Values From List is: " + option.getText());
				option.click();
				break;
			}
		}
		
		// Add New Stock Journal Voucher
		WebElement stAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add')]")));
		System.out.println("Add Button is displayed: " + stAdd.isDisplayed());
		stAdd.click();
		System.out.println("Add Button Clicked");
		
		// Add Date in stock Journal Voucher
		WebElement stDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='mDate'])[3]")));
		//stDate.clear();
		stDate.sendKeys("01122021");
		stDate.sendKeys(Keys.TAB);
		
		// Add Stock Journal Voucher No 
		WebElement stVouNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'mGridDDL')])[1]")));
		stVouNo.sendKeys("ST/1");
		stVouNo.sendKeys(Keys.TAB);
		
		// Select Process Name
		String first_Xpath = "(//table[contains(@class,'dx-datagrid-table')])[7]//tbody//tr[";
		String last_Xpath = "]//td[1]";
		String popValue = "General Entry";
		for (int i=1; i<=3; i++)
		{
			WebElement pName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(first_Xpath + i + last_Xpath)));
			if (pName.getText().contains(popValue))
			{
				System.out.println("Selected Process Name is: " + pName.getText());
				pName.click();
				pName.sendKeys(Keys.ENTER);
				break;
			}
		}
		
		// Add Item in ItemGrid..	
		WebElement itemEntry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class,'mEntryColumn dx-texteditor-input')]")));
		itemEntry.sendKeys(Keys.ENTER);
		
		// Add New Product by clicking on Add Button in Product Name Window ..
		WebElement proEntry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Add'])[2]")));
		proEntry.click();
		System.out.println("*** Add New Product window opened successfully ***");
		
		// Add Product Name
		WebElement pName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtProductName')]//div//div//input")));
		pName.sendKeys("Pro1");
		System.out.println(pName.getText());
		pName.sendKeys(Keys.TAB);
		
		// Add Product Alias Name
		WebElement pAliasNm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtAlias')]//div//div//input")));
		pAliasNm.sendKeys("p1");
		pAliasNm.sendKeys(Keys.TAB);
		
		// Select GST Commodity ....
		//(//table[contains(@class,'dx-datagrid-table')])[9]//tr[2]//td[1]
		String befor_Gstcomm = "(//table[contains(@class,'dx-datagrid-table')])[9]//tr[";
		String after_Gstcomm = "]//td[1]";
		String commodityValue = "GST 12%";
		for (int i=1; i<=5; i++)
		{
			WebElement commodityList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(befor_Gstcomm +i+ after_Gstcomm)));
			if (commodityList.getText().contains(commodityValue))
			{
				System.out.println("Selected GST Commodity is: "+ commodityList.getText());
				commodityList.click();
				commodityList.sendKeys(Keys.ENTER);
				break;
			}
		}
		
		// Select value in Stock Option...
		//(//table[contains(@class,'dx-datagrid-table')])[8]//tr[1]//td[1]
		String before_stock = "(//table[contains(@class,'dx-datagrid-table')])[8]//tr[";
		String after_stock = "]//td[1]";
		String stockValue = "Yes";
		for (int i=1; i<=2; i++)
		{
			WebElement stockList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(before_stock +i+ after_stock)));
			if (stockList.getText().contains(stockValue))
			{
				System.out.println("Selected Stock Option is: "+ stockList.getText());
				stockList.click();
				stockList.sendKeys(Keys.ENTER);
				break;
			}
		}
		
		// Add Purchase Rate..
		WebElement pRate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtPurchaseRate')]//div//div//input")));
		pRate.sendKeys("1000.10");
		pRate.sendKeys(Keys.TAB);
		
		// Add Sales Rate..
		WebElement sRate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtSalesRate')]//div//div//input")));
		sRate.sendKeys("2000.20");
		sRate.sendKeys(Keys.TAB);
		
		// Select Sales Unit..
		//(//table[contains(@class,'dx-datagrid-table')])[9]//tr[3]//td[1]
		String before_sUnit = "(//table[contains(@class,'dx-datagrid-table')])[9]//tr[";
		String after_sUnit = "]//td[1]";
		String sUnitValue = "Cubic Centimetre";
		for (int i=1; i<=16; i++)
		{
			WebElement sUnitList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(before_sUnit +i+ after_sUnit)));
			if (sUnitList.getText().contains(sUnitValue))
			{
				System.out.println("Selected Sales Unit is: "+ sUnitList.getText());
				sUnitList.click();
				sUnitList.sendKeys(Keys.ENTER);
				break;
			}
		}
		
		// Select Purchase Unit..
		//(//table[contains(@class,'dx-datagrid-table')])[9]//tr[3]//td[1]
		String before_pUnit = "(//table[contains(@class,'dx-datagrid-table')])[9]//tr[";
		String after_pUnit = "]//td[1]";
		String pUnitValue = "Cubic Centimetre";
		for (int i=1; i<=16; i++)
		{
				WebElement pUnitList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(before_pUnit +i+ after_pUnit)));
				if (pUnitList.getText().contains(pUnitValue))
				{
					System.out.println("Selected Purchase Unit is: "+ pUnitList.getText());
					pUnitList.click();
					pUnitList.sendKeys(Keys.ENTER);
					break;
				}
		}

		// Select GST Unit (UQC) ..
		//(//table[contains(@class,'dx-datagrid-table')])[9]//tr[3]//td[1]
		String before_GUnit = "(//table[contains(@class,'dx-datagrid-table')])[9]//tr[";
		String after_GUnit = "]//td[1]";
		String GUnitValue = "BDL-BUNDLES";
		for (int i=1; i<=45; i++)
		{
				WebElement GUnitList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(before_GUnit +i+ after_GUnit)));
				if (GUnitList.getText().contains(GUnitValue))
				{
					System.out.println("Selected GST Unit(UQC) is: "+ GUnitList.getText());
					GUnitList.click();
					GUnitList.sendKeys(Keys.ENTER);
					break;
				}
		}
		
		// Add Opening Stock details..
		// Add Opening Quantity detail..
		WebElement opnQty = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtOpeningQty')]//div//div//input")));
		opnQty.sendKeys("10");
		opnQty.sendKeys(Keys.TAB);
		
		// Add Opening Amount detail..
		WebElement opnAmt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id,'txtOpeningAmt')]//div//div//input")));
		opnAmt.sendKeys("500");
		opnAmt.sendKeys(Keys.TAB);
		/*
		// Click on OK Button in Add New Product Window..
		WebElement btnOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='OK']")));
		btnOk.click();
		System.out.println("***New Product Added successfully***");
		*/
	}

}
