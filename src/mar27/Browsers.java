package mar27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Browsers {

	public static void main(String[] args) throws Throwable {
		//create instance object for webdriver

//WebDriver driver = new FirefoxDriver();
//WebDriver driver= new EdgeDriver();
		
WebDriver driver=new ChromeDriver();	
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

//Launch url
driver.get("https://www.google.com");
//driver.get("https://www.facebook.com");


//suspend tool from execution for 5seconds
Thread.sleep(5000);
driver.quit();


		
		
		
	}

}
