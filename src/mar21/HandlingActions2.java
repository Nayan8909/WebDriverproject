package mar21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingActions2 {
// if no any google account is logged in into the system and user tries to logged in it
	
	public static void main(String[] args) throws Throwable {
//mouse to create account link
		//press up arrow for 3 times
		//click enter key
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=Ab5oB3r3x5-FX30CVjC_qubjWS3d6RbxGpTf9DeMFI-m4ZEpwWgcQSVjswCRhJXfpCG7u5L22fA3gg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-852574425%3A1723559375374161&ddm=0");
		
		Thread.sleep(5000);
		//Create object for actions class
		Actions ac = new Actions(driver);
				ac.moveToElement(driver.findElement(By.linkText("//span[normalize-space()='Create account']")));
				ac.click().perform();     //ac.click().build().perform();
				Thread.sleep(4000);
//press arrow 3 times up
				ac.sendKeys(Keys.ARROW_UP).perform();
				Thread.sleep(4000);
				ac.sendKeys(Keys.ARROW_UP).perform();
				Thread.sleep(4000);
				ac.sendKeys(Keys.ARROW_UP).perform();
				Thread.sleep(4000);
				ac.sendKeys(Keys.ENTER).perform();
				Thread.sleep(4000);
				
				driver.findElement(By.name("firstname")).sendKeys("Testing");
				driver.findElement(By.name("laststname")).sendKeys("Selenium");
				driver.findElement(By.xpath("//span[normalize-space()=Next']")).click();
				Thread.sleep(4000);

				Select listbox = new Select(driver.findElement(By.id("month")));
				List<WebElement> all_items = listbox.getOptions();
				System.out.println(all_items.size());
				for (WebElement each : all_items) {
					System.out.println(each.getText());
					
				}
				
				Thread.sleep(4000);	
driver.quit();

		
	}

}
