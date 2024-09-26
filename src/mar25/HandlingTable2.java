package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//Store table into webelement
		WebElement webtable=driver.findElement(By.className("dataTable"));
		//get collection of rows in webtable
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int row =rows.size()-1;
	System.out.println(rows.size());
	
	//Iterate all rows
	for(int i=1; i<rows.size();i++)
	{
		//get cell collection from each row
		List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		System.out.println("Row No: "+i+"    "+"column size::"+cols.size());
	}
	
	
	driver.quit();
	}

}


/*
26
Row No: 1    column size::3
Row No: 2    column size::3
Row No: 3    column size::3
Row No: 4    column size::3
Row No: 5    column size::3
Row No: 6    column size::3
Row No: 7    column size::3
Row No: 8    column size::3
Row No: 9    column size::3
Row No: 10    column size::3
Row No: 11    column size::3
Row No: 12    column size::3
Row No: 13    column size::3
Row No: 14    column size::3
Row No: 15    column size::3
Row No: 16    column size::3
Row No: 17    column size::3
Row No: 18    column size::3
Row No: 19    column size::3
Row No: 20    column size::3
Row No: 21    column size::3
Row No: 22    column size::3
Row No: 23    column size::3
Row No: 24    column size::3
Row No: 25    column size::3

*/