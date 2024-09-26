package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		//store table
		WebElement webtable = driver.findElement(By.className("ws-table-all notranslate")); 
		List<WebElement> rows, cols;
		//get rows collection from webtable
		rows=webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(5000);

		//iterate all rows
		for (WebElement eachrow : rows) {
			//get each row cell collection
			cols=webtable.findElements(By.tagName("td"));
			//iterate each cell
			for (WebElement eachcell : cols) {
				Thread.sleep(5000);
				System.out.println(eachcell.getText());
				
			}
			System.out.println("@@@@@@@@@@");
			
		}
		Thread.sleep(5000);

	driver.quit();
	}

}
