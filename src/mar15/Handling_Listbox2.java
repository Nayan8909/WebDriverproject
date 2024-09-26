package mar15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Handling_Listbox2 {

	public static void main(String[] args) throws Throwable {
		//select items in listbox from 0 to 9
		//get collection of items which are selected
		//print each item name which are selected

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("file:///C:/Users/Bhairavnath/Downloads/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiselection")));
		//verify listbox is single or multiselection listbox

		//select items in listbox from 0 to 9
		for(int i=0;i<=8;i++)
		{
			dropdown.selectByIndex(i);
		}
		//get collection of items which are selected
		List<WebElement> all_selected = dropdown.getAllSelectedOptions();
		System.out.println("No. of items selected  "+all_selected.size());

		//print each item name which are selected

		for (WebElement each : all_selected) {
			System.out.println(each.getText());

		}
		Thread.sleep(1000);
		driver.quit();
	}

}
