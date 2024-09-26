package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCRadioButtons {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.irctc.co.in/nget/train-search");
Thread.sleep(5000);
driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
driver.findElement(By.xpath("(//label[normalize-space()='E-CATERING'])[1]")).click();

Thread.sleep(3000);
driver.quit();
	}

}
