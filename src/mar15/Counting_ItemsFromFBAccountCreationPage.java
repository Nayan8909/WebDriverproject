package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Counting_ItemsFromFBAccountCreationPage {

	public static void main(String[] args) throws Throwable {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(5000);

//Store three listboxes into select class
Select daylistbox = new Select(driver.findElement(By.name("birthday_day")));
//Select monthlistbox = new Select(driver.findElement(By.name("birthday_month")));
//Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
//get collection of items in day list
List<WebElement> day_items= daylistbox.getOptions();
System.out.println("No. of items are :: "+day_items.size());
Thread.sleep(5000);
//Print each and every object from listbox
for (WebElement each : day_items) {
	System.out.println(each.getText());
	
}
driver.quit();


	}

}


/* OUTPUT
No. of items are :: 31
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
*/