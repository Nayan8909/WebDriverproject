package mar22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {

	public static void main(String[] args) throws Throwable {

						WebDriver driver = new ChromeDriver();
						driver.manage().window().maximize();
						//create object for interface
						JavascriptExecutor js = (JavascriptExecutor)driver;
						//launch url
						js.executeScript("window.location='https://www.myntra.com/'");
						//print title and length of title
						String pagetitle= js.executeScript("return document.title").toString();
						System.out.println(pagetitle);
						Thread.sleep(4000);
						WebElement element = driver.findElement(By.linkText("Men"));
						//scroll to men link and click in
						js.executeScript("documrnt.scrollInToView", element);
						element.click();
						//print title and length of title
						String pagetitle1= js.executeScript("return document.title").toString();
						System.out.println(pagetitle1);
						
					Thread.sleep(4000);
					driver.quit();
	}

}
