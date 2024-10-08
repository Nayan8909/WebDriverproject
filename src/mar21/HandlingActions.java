package mar21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		//Create object for action class
		Actions ac = new Actions(driver);
		//Enter some text in textbox
		driver.findElement(By.name("q")).sendKeys("Selenium openings in ");
		Thread.sleep(5000);

		//click down arrows 3 times
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		ac.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		//click enter
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);

		driver.quit();

	}

}
