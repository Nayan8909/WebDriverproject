package mar20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) throws Throwable {
		// get collection of checkboxes
		//verify which checkbox is true and false
		//get each checkbox name into value property
		//uncheck checkbox is already checked and check checkbox if not checked
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("path of file");
		Thread.sleep(5000);
		List<WebElement> all_checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No. of checkboxes are : "+all_checkboxes.size());
		for (WebElement each : all_checkboxes) {

			boolean value=each.isSelected();
			String checkboxname = each.getAttribute("value");
			System.out.println(checkboxname+" ======  "+value);
			Thread.sleep(5000);
			each.click();
				
			
		}
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
