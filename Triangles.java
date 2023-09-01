import java.util.*;
import java.text.*;

public class Triangles {
	public static void main (String[] args) {
		System.out.println ("This program computes the angles and area of");
		System.out.println ("a triangle given the lengths of the sides.");
		System.out.println ();
		Scanner console = new Scanner (System.in);
		System.out.print ("length of side a: ");
		double a = console.nextDouble();
		System.out.print ("length of side b: ");
		double b = console.nextDouble();
		System.out.print ("length of side c: ");
		double c = console.nextDouble();
		System.out.println ();
		DecimalFormat df = new DecimalFormat("0.00000");
		double A = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));
		double B = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2 * a * c)));
		double C = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		if (a + b < c || b + c < a || a + c < b) {
			System.out.println ("impossible triangle");
		}
		System.out.println ("angle A = " + df.format(A).toLowerCase());
		System.out.println ("angle B = " + df.format(B).toLowerCase());
		System.out.println ("angle C = " + df.format(C).toLowerCase());
		System.out.println ("area = " + df.format(area).toLowerCase());
		console.close();
	}
}
