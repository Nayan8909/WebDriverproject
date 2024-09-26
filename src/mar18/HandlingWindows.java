package mar18;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows {

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
//CLick three links
driver.findElement(By.xpath("//a[contains(text(),'Terms')])[2]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')])[2]")).click();
driver.findElement(By.linkText("Cookies Policy")).click();



//get collection of windows
Set<String> allwins = driver.getWindowHandles();
System.out.println(allwins);
for (String each : allwins) {
	//if parent id not equals to each
	if(!parent.equals(each))
	{
		//switch to child window and close
		String pageTitle = driver.switchTo().window(each).getTitle();
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
//switch to parent
driver.switchTo().window(parent);
Select element = new Select(driver.findElement(By.id("year")));
List<WebElement> all_items = element.getOptions();
System.out.println(" no. of items are :: "+all_items.size());
for (WebElement each : all_items) {
	{
		System.out.println(each.getText());
	}
	
}

driver.quit();
	}

}
