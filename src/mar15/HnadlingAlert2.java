package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadlingAlert2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//img[@src='images/Branches_but.jpg'])[1]")).click();
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(5000);
		String Alerttext1=driver.switchTo().alert().getText();
		System.out.println(Alerttext1);
		Thread.sleep(5000);
// Clcik cancle button
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(5000);
		//Clcik o OK button
		driver.switchTo().alert().accept();
		Thread.sleep(5000);

		String Alerttext2=driver.switchTo().alert().getText();
		System.out.println(Alerttext2);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
