package mar19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBRadioButtons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		//get parent ID
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
//get collection of radio buttons
		List<WebElement> radios = driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
		System.out.println("No. of radio buttons are ::"+radios.size());
		for (WebElement each : radios) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
driver.quit();
	}

}

/* OUTPUT
734A5B25BF4D3E0D1BF6EC6A25A480D2
No. of radio buttons are ::3
Female
Male
Custom
*/