package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String filename ="C:/Temp/testo.txt";
		
		File f = new File(filename);
		
		Scanner in = new Scanner(f);
		int count = 1;
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count+" -> "+line);
			count++;
		}
		
		in.close();
		
	
		

		

		
		
	}

}
