package mar19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ConditionalMethods {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://facebook.com");
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(5000);

//verify firstname textbox is enable or disable
WebElement firstname = driver.findElement(By.name("firstname"));
boolean is_Enabled = firstname.isEnabled();
System.out.println(is_Enabled);
//verify reenter email textbox is displayed or hidden

WebElement emailaddress =driver.findElement(By.name("firstname"));
boolean is_Displayed = emailaddress.isDisplayed();
System.out.println(is_Displayed);

//verify female button is isselected or not

WebElement radiobutton = driver.findElement(By.xpath("//input[@value='1']\"))"));
boolean is_Selected = radiobutton.isSelected();
System.out.println(is_Selected);
driver.quit();

	}
	

}
