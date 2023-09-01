import java.util.*;

public class SpaceNeedleRedo {
	static int n;
	public static void main (String[] args) {
		needle ();
	}
	public static void writeChar (char ch, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print (ch);
		}
	}
	public static void needle () {
		Scanner console = new Scanner (System.in);
		System.out.print ("enter SIZE: ");
		int number = console.nextInt ();
		System.out.println ();
		for (int i = 0; i < number; i++) {
			writeChar (' ', number * 3);
			writeChar ('|', 2);
			System.out.println();
		}
		for (int i = 0; i < number; i++) {
			writeChar(' ', (number - i - 1) * 3);
			System.out.print ("__/");
			writeChar (':', i * 3);
			System.out.print ("||");
			writeChar (':', i * 3);
			System.out.println ("\\__");
		}
		System.out.print ("|");
		writeChar ('\"', number * 6);
		System.out.println ("|");
		for (int i = number; i > 0; i--) {
			writeChar (' ', (number - i) * 2);
			System.out.print ("\\__");
			for (int j = 0; j < i * 2 + number - 1; j++) {
				System.out.print("/\\");
			}
			System.out.println ("__/");
		}
		for (int i = 0; i < number; i++) {
			writeChar (' ', number * 3);
			System.out.println ("||");
		}
		for (int i = 0; i < number * number; i++) {
			writeChar(' ', number * 2 + 1);
			System.out.print ("|");
			writeChar ('%', number - 2);
			System.out.print ("||");
			writeChar ('%', number - 2);
			System.out.println ("|");
		}
		for (int i = 0; i < number; i++) {
			writeChar(' ', (number - i - 1) * 3);
			System.out.print ("__/");
			writeChar (':', i * 3);
			System.out.print ("||");
			writeChar (':', i * 3);
			System.out.println ("\\__");
		}
		System.out.print ("|");
		writeChar ('\"', number * 6);
		System.out.println ("|");
		console.close();
	}
}
