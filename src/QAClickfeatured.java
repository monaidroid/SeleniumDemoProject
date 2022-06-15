import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAClickfeatured 
{

	public static void main(String[] args) 
	{
		// QACLickAcademy Featured Courses Print by Automation Script..
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver Chdriver = new ChromeDriver();
		
		// Load QAClickAcademy website using get() Method...... 
		Chdriver.get("http://www.qaclickacademy.com/");
		
		// Print Title of Featured Courses...
		String ConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/div/h2")).getText();
		System.out.println("Title is: " + ConTitle);
		System.out.println("******************************************************");
		
		// Print Titles of All Courses.....
		String FConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/div/h3/a")).getText();
		System.out.println("1st Course Title is:" + FConTitle);
		// Print 1st Course Rating & Enrolled Students Details....
		String FRSEnr = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[1]/div/div[1]/p[2]/span[2]")).getText();
		System.out.println("1st Course Rating & Studs Enrolled are: " + FRSEnr);
		
		String SConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[2]/div/h3/a")).getText();
		System.out.println("2nd Course Title is:" + SConTitle);
		
		String TConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[3]/div/h3/a")).getText();
		System.out.println("3rd Course Title is:" + TConTitle);
		
		String FconTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[4]/div/h3/a")).getText();
		System.out.println("4th Course Title is:" + FconTitle);
		
		String FthConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[5]/div/h3/a")).getText();
		System.out.println("5th Course Title is:" + FthConTitle);
		
		String SthConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[6]/div/h3/a")).getText();
		System.out.println("6th Course Title is:" + SthConTitle);
		
		String SeConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[7]/div/h3/a")).getText();
		System.out.println("7th Course Title is:" + SeConTitle);
		
		String EConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[8]/div/h3/a")).getText();
		System.out.println("8th Course Title is:" + EConTitle);
		
		String NConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[9]/div/h3/a")).getText();
		System.out.println("9th Course Title is:" + NConTitle);
		
		String TeConTitle = Chdriver.findElement(By.xpath("//*[@id=\'content\']/div/ul/li[10]/div/h3/a")).getText();
		System.out.println("10th Course Title is:" + TeConTitle);
		
		System.out.println("******************************************************");
		System.out.println("All Courses Title Printed Successfully!!!");
		
		// Print Details of All Courses Conducted & Delivered by ... 
		String DelBy = Chdriver.findElement(By.xpath("/html/body/section[1]/div/ul/li[1]/div/div[1]/p[1]/a")).getText();
		System.out.println("All Courses Created " + DelBy);
		
		// Close the browser..... 
		Chdriver.close();
	}

}
