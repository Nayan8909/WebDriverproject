package mar23;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiginJavaScript {

	public static void main(String[] args) throws Throwable {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.location='https://orangehrm.qedgetech.com/'");

//js.executeScript("window.location='https://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
Thread.sleep(5000);
js.executeScript("document.queryselector('(#txtUsername').value='Admin'");
js.executeScript("document.queryselector('#txtPassword').value='Qedge123!@#'");
js.executeScript("document.queryselector('').click()");
Thread.sleep(5000);
String Expected="dashboard";
String Actual = js.executeScript("return documet.URL").toString();
if(Actual.contains(Expected))
{
	System.out.println("LOgin Success  "+Expected+"   "+Actual);
}
else
{
	String error = js.executeScript("return document.querySelector('').innerHTML").toString();
	System.out.println(error+"   "+Expected+"   "+Actual);
}
Thread.sleep(5000);



	}

}
