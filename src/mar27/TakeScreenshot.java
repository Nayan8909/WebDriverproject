package mar27;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
//for this downloaded and added jar files to WebDriver Project - (commons_io_2151jar_lyst6721)
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//take screenshot and store
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Cope screen shot into local system
		FileUtils.copyFile(screen, new File("D:/ScreenShot/homapage.png"));
		driver.quit();
	}

}
