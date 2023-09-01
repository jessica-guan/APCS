import java.util.*;

public class WriteBinaryString {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = console.nextInt();
		if (n >= 0) {
			System.out.println("Binary expression: " + (writeBinaryString(n)));
		} else {
			System.out.println("Binary expression: " + (writeBinaryString(n)));
		}
		console.close();
	}
	public static String writeBinaryString (int n) {
		if (n == 0) {
			  return Integer.toString(0);
	    }
		if (n == 1) {
			  return Integer.toString(1);
	    }
	    return (Long.toString(n % 2 + 10 * Long.valueOf(writeBinaryString(n / 2))));
	}
}
