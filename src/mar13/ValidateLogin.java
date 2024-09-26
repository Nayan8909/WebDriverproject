package mar13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);

		//Store username textbox insto webelement to access more than one webelement method
		WebElement Objuser =driver.findElement(By.xpath("//input[@id='txtUsername']"));

		//clear text
		Objuser.clear();

		//send value into textbox
		Objuser.sendKeys("Admin4");        //execute same by entring wrong UN or PW to capture error msg

		//Capture username value
		String usernametext=Objuser.getAttribute("value");    //value is propertyname which store value of username at runtime


		//Store password textbox insto webelement to access more than one webelement method
		WebElement Objpass =driver.findElement(By.xpath("//input[@id='txtPassword']"));

		//clear text
		Objpass.clear();

		//send value into textbox
		Objpass.sendKeys("Qedge123!@#");

		//Capture username value
		String passwordtext=Objpass.getAttribute("value"); 
		System.out.println(usernametext+"               "+passwordtext);

		//Click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Thread.sleep(5000);

		String Expected="dashboard";
		String Actual= driver.getCurrentUrl();
		if(Actual.contains(Expected))

		{
			System.out.println("username and passwords are valid"+Expected+"    "+Actual);
		}
		else
		{
			//capture error msg
			String error_message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(error_message+"    "+Expected+"      "+Actual);

		}

		Thread.sleep(50000);
		driver.quit();


	}

}
