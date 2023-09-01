import java.util.*;

public class TimeCapsuleHeight {
	public static int number;
	public static void main (String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("enter HEIGHT: ");
		number = console.nextInt(); 
		System.out.println ();
		for (int i = 0; i < number; i++) {
			System.out.print (" ");
		}
		System.out.println ("*");
		for (int i = 0; i < number; i++) {
			for (int k = 0; k < number - i - 1; k++) {
				System.out.print (" ");
			}
			System.out.print ("/");
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print ("o");
			}
			System.out.println ("\\");
		}
		System.out.print ("|");
		for (int i = 0; i < number * 2 - 1; i++) {
			System.out.print ("@");
		}
		System.out.println ("|");
		for (int i = 0; i < number * 2 - 3; i++) {
			System.out.print ("|@");
			for (int k = 0; k < number * 2 - 3; k++) {
				System.out.print (" ");
			}
			System.out.println ("@|");
		}
		System.out.print ("|");
		for (int i = 0; i < number * 2 - 1; i++) {
			System.out.print ("@");
		}
		System.out.println ("|");
		for (int i = number - 1; i >= 0; i--) {
			for (int k = 0; k < number - i - 1; k++) {
				System.out.print (" ");
			}
			System.out.print ("\\");
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print ("o");
			}
			System.out.println ("/");
		}
		for (int i = 0; i < number; i++) {
			System.out.print (" ");
		}
		System.out.println ("*");
		console.close();
	}
}
