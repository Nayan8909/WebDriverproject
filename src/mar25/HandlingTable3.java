package mar25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows, cols;
		//get rows collection from webtable
		rows=webtable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get each row cell collection
			cols=webtable.findElements(By.tagName("td"));
			//iterate each cell
			for (WebElement eachcell : cols) {
				System.out.println(eachcell.getText());
				
			}
			System.out.println("+++++++++++");
			
		}
		Thread.sleep(5000);

	driver.quit();
		
		
				
	}

}


/*
25
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
Invest
+++++++++++
Nippon India CPSE ETF - Growth - Regular Plan
112.76
Invest
HDFC Defence Fund - Direct Plan - Growth
98.73
Invest
HDFC Defence Fund - Direct Plan - IDCW
98.73
Invest
HDFC Defence Fund - Growth - Regular Plan
96.29
Invest
HDFC Defence Fund - IDCW - Regular Plan
96.29
Invest
Motilal Oswal BSE Enhanced Value ETF - Growth - Regular Plan
85.02
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - IDCW
84.74
Invest
ICICI Prudential PSU Equity Fund - Direct Plan - Growth
84.59
Invest
Invesco India PSU Equity Fund - Direct Plan - Growth
84.42
Invest
Invesco India PSU Equity Fund - Direct Plan - IDCW
84.40
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Direct Plan - Growth
83.26
Invest
Aditya Birla Sun Life PSU Equity Fund - Direct Plan - Growth
82.41
Invest
ICICI Prudential PSU Equity Fund - Growth - Regular Plan
82.19
Invest
ICICI Prudential PSU Equity Fund - IDCW - Regular Plan
82.19
Invest
Invesco India PSU Equity Fund - Growth - Regular Plan
82.07
Invest
Invesco India PSU Equity Fund - IDCW - Regular Plan
82.05
Invest
UTI Nifty 500 Value 50 Index Fund - Direct Plan - Growth
82.05
Invest
Motilal Oswal BSE Enhanced Value Index Fund - Growth - Regular Plan
82.03
Invest
SBI PSU Fund - Direct Plan - Growth
81.91
Invest
SBI PSU Fund - Direct Plan - IDCW
81.90
Invest
SBI PSU Fund - Direct Plan - IDCW-Reinvestment
81.90
Invest
LIC MF Infrastructure Fund - Direct Plan - Growth
81.59
Invest
LIC MF Infrastructure Fund - Direct Plan - IDCW
81.46
Invest
UTI Nifty 500 Value 50 Index Fund - Growth - Regular Plan
81.18
Invest
Bandhan Infrastructure Fund - Direct Plan - Growth
80.63
*/