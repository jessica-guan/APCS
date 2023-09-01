import java.util.*;

public class EuclidGCD {
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter positive integer a: ");
		int a = console.nextInt();
		int b = console.nextInt();
		System.out.println("Enter positive integer b: ");
		System.out.println("Greatest common divisor (GCD) = " + GCD(a,b));
		console.close();
	}
	public static int GCD (int x, int y) {
		int z = 0;
		while (y != 0) {
			z = x;
			x = y;
			y = z % y;
		}
		return x;
	}
}
