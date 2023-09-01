import java.util.*;
import java.math.*;

public class EFibonacci {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print ("Enter number of terms: ");
		int count = console.nextInt();
    BigInteger num1 = new BigInteger ("0");
    BigInteger num2 = new BigInteger ("1");
    BigInteger sumOfPrevTwo = new BigInteger ("0");
    for (int i = 1; i <= count; ++i) {
      System.out.println (num1);
      sumOfPrevTwo = num1.add (num2);
      num1 = num2;
      num2 = sumOfPrevTwo;
    }
    console.close();
  }
}