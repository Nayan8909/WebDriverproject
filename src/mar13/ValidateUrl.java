package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrl {

	//Write a script to validate url conatins protocol https:// or not.

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		String Expected="https://";
		String Actual = driver.getCurrentUrl();    //It is comapring with runtime url hence its consider https://hgmail.com and prints o/p as true
		if(Actual.startsWith((Expected)))	
		{
			System.out.println("URL is secure  "+Expected+"      "+Actual);
		}
		else
		{
			System.out.println("URL is Local  "+Expected+"      "+Actual);

		}
		driver.quit();
	}

}
