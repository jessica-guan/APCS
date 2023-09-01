import java.util.*;
import java.math.*;

public class WriteBinary {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = console.nextInt();
		BigInteger N = BigInteger.valueOf(n);
		if (N.compareTo(BigInteger.valueOf(0)) > 0) {
			System.out.println(writeBinary(BigInteger.valueOf((int) Math.abs(n))));
		} else {
			System.out.println(writeBinary(BigInteger.valueOf((int) Math.abs(n))).multiply(BigInteger.valueOf(-1)));
		}
		console.close();
	}
	public static BigInteger writeBinary (BigInteger n) {
		if (n.compareTo(BigInteger.valueOf(0)) == 0) {
			  return BigInteger.valueOf(0);
	    }
		if (n.compareTo(BigInteger.valueOf(1)) == 0) {
			  return BigInteger.valueOf(1);
	    }
	    return ((writeBinary(n.divide(BigInteger.valueOf(2))).multiply(BigInteger.valueOf(10))).add(n.mod(BigInteger.valueOf(2))));
	}
}
