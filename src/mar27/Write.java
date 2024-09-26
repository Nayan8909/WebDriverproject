package mar27;

// import java.io.*; It includes all java related paclages
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Write {
//Write a script to write text in a file
	public static void main(String[] args) throws Throwable {
//craete new file
		File f= new File("D:/mrngbatch.txt");
		FileWriter fw= new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("I want jog in top MNC");
		bw.newLine();
		bw.write("I want 20L package");
		bw.newLine();
		bw.write("with attending classes and practice");
		bw.flush();
		bw.close();
	}

}
