package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		
		//Write a script to verify your expected title with Actual title.
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");   //If URL is Yahoo.com then result is else part
		Thread.sleep(5000);
		String Expected = "google";
		String Actual =driver.getTitle();
		if(Expected.equalsIgnoreCase(Actual))
		{
			System.out.println("Title is matching   "+Expected+ "              "+Actual);
		}
		else
		{
			System.out.println("Title is not matching    "+Expected+ "              "+Actual);

		}
		driver.quit();
	}

}
