package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_ItemPresentInList {

	public static void main(String[] args) throws Throwable {
		String Item_Present = "baby";
	//	String Item_Present = "Ameerpet";

		boolean Item_Exist = false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Select listbox= new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_items = listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each : all_items) {
			String Actual_items = each.getText();
			Thread.sleep(1000);
			System.out.println(Actual_items);
			if(Actual_items.equalsIgnoreCase(Item_Present))
			{
				Item_Exist=true;
				break;
			}
		}
		if(Item_Exist)
		{
			System.out.println(Item_Present+"   "+"Item exist in listbox");
		}
		else
		{
			System.out.println(Item_Present+"   "+"Item does not exist in listbox");

		}
		Thread.sleep(5000);
		driver.quit();
	}

}


/* OUTPUT
 * 
 * 45
All Categories
Alexa Skills
Amazon Devices
Amazon Fashion
Amazon Fresh
Amazon Pharmacy
Appliances
Apps & Games
Audible Audiobooks
Baby
baby   Item exist in listbox
*/
