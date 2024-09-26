package mar14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//counting linkd a nd printing them from any webpage
public class CountingLinks {

	public static void main(String[] args) throws Throwable {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("http://primusbank.qedgetech.com/");
//driver.get("http://rediff.com/");

Thread.sleep(5000);
//get collection of links in webpage whicj are stored into html tag a
List<WebElement> all_Links = driver.findElements(By.tagName("a")); //list holding integer collection  and webelement holding element collection
	System.out.println("No. of links are ::"+all_Links.size());
	
	//Print each link name
	for (WebElement each : all_Links) {     //each holding position starting form 0. 
		System.out.println(each.getText());		
	}
	}

}

//here the blank space means links which text is not visible
/* OUTPUT
No. of links are ::11





Customer Service
Internet Banking FAQ's
Privacy
Terms and Conditions
Disclaimer
Site Map
*/