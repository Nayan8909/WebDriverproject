package mar27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Write a script to read line by line from existing notepad
public class Readdata {

	public static void main(String[] args) throws Throwable {
FileReader fr = new FileReader("D:/mrngbatch.txt");
BufferedReader br = new BufferedReader(fr);
String str;           //created object too store the data which is read by system
while ((str=br.readLine())!=null) {
	Thread.sleep(1000);
	System.out.println(str);
}
	}

}
