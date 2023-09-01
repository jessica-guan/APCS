import java.io.*;
import java.util.*;

public class WordCount {
	public static void main(String [] args) throws FileNotFoundException {
		System.out.print("Enter name of text file, e.g. Iliad.txt: ");
		Scanner console = new Scanner(System.in);
		String string = console.next();
		File f = new File(string);
		Scanner input = new Scanner(f);
		int count = 0;
		while (input.hasNext()) {
			count++;
		}
		System.out.println("Total words = " + count);
		console.close();
		input.close();
	}
}
