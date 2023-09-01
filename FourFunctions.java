import java.util.*;

public class FourFunctions {
	public static void main (String[] args) {
		System.out.println ();
		int [] arr = input ();
		System.out.println ("sum        = " + add (arr [0], arr [1]));
		System.out.println ("difference = " + subtract (arr [0], arr [1]));
		System.out.println ("product    = " + multiply (arr [0], arr [1]));
		System.out.println ("quotient   = " + divide (arr [0], arr [1]));
		System.out.println ();
	}
	public static int [] input () {
		Scanner console = new Scanner (System.in);
		System.out.print ("Please enter your first  number: ");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		System.out.println ("Please enter your second number: ");
		console.close();
		int [] arr = new int [2];
		arr [0] = num1;
		arr [1] = num2;
		return arr;
	}
	public static double add (int num1, int num2) {
		double sum = num1 + num2;
		return sum;
	}
	public static double subtract (int num1, int num2) {
		double difference = num1 - num2;
		return difference;
	}
	public static double multiply (int num1, int num2) {
		double product = num1 * num2;
		return product;
	}
	public static double divide (int num1, int num2) {
		double a = num1;
		double b = num2;
		double quotient = a / b;
		return quotient;
	}
}
