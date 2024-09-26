package mar13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
		
		//Print title of page or length of title
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);;
		System.out.println(pagetitle.length());
		
		//Print url and length of url
		String strUrl = driver.getCurrentUrl();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
		driver.quit();
	}

}
