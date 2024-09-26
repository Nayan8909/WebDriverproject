package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click on sign In button without enetering login detaisl
		driver.findElement(By.name("proceed")).click();
		String alert_mesage = driver.switchTo().alert().getText();
		System.out.println(alert_mesage);
		Thread.sleep(5000);

		//Clcik on OK from alert popup
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
