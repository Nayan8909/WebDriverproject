package mar18;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

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
			
			
			//store all windows in into array list
			ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(brw.get(2));

			System.out.println(driver.getTitle());
			driver.findElement(By.name("email")).sendKeys("pranga2010");
			driver.findElement(By.name("pass")).sendKeys("@#$%^^^^&");
			driver.findElement(By.xpath("//input[@value='Log in'")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);

			driver.quit();
	}

}
