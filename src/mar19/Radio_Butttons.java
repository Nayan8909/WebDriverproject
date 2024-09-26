package mar19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Butttons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);

		//get collection of radio buttons
		
		List<WebElement> radios=driver.findElements(By.xpath("//div[contains(@class,'fareCardItem')]"));
		System.out.println("No. of radio buttons are ::"+radios.size());
		for (WebElement each : radios) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
driver.quit();
	}
}


/* OUTPUT
 * No. of radio buttons are ::5
Regular
Regular fares
Student
Extra discounts/baggage
Senior Citizen
up to ₹600 off
Armed Forces
up to ₹600 off
Doctor and Nurses
up to ₹600 off

*/
