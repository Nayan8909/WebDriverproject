package mar15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Listbox1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.navigate().to("");
Thread.sleep(5000);
Select dropdown = new Select(driver.findElement(By.name("multiselection")));
//verify listbox is single or multiselection listbox
boolean value = dropdown.isMultiple();
System.out.println(value);
// select 0 to 8
for(int i=0;i<=8;i++)
{
	Thread.sleep(3000);
	//Select one by one item
	dropdown.selectByIndex(i);
}
//deselect from selection
dropdown.deselectByVisibleText("Yellow");
Thread.sleep(3000);
dropdown.deselectByIndex(0);
Thread.sleep(3000);
dropdown.deselectAll();
Thread.sleep(3000);
driver.quit();
	}

}
