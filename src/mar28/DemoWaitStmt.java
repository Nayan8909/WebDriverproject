package mar28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWaitStmt {
/*Explanation- implicit wait is applied to all the elements in the script
We need not to specify Expectedconditions on the element to be located
Its recommended to the elements which are loaded in less timestamp
	*/
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("testing");
		driver.findElement(By.name("lastname")).sendKeys("manual");

	}

}
