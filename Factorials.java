import java.util.*;
import java.math.*;

public class Factorials {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a natural number (non-negative integer):");
    int n = scan.nextInt();
    System.out.println ("Factorial: " + factorial (n));
    System.out.println ("Superfactorial: " + superfactorial (n));
    System.out.println ("Ultrafactorial: " + ultrafactorial (n));
  }

  public static BigInteger factorial (int n) {
    BigInteger bigInteger = new BigInteger ("1");
    for (int i = 1; i <= n; i++) {    
      bigInteger = bigInteger.multiply (BigInteger.valueOf(i));    
    }
    bigInteger = bigInteger.mod (BigInteger.valueOf(179424691));
    return (bigInteger);
  }

   public static BigInteger superfactorial (int n) {
    BigInteger bigInteger = new BigInteger ("1");
    for (int i = 1; i <= n; i++) {    
      bigInteger = bigInteger.multiply (factorial (i));
    }
    bigInteger = bigInteger.mod (BigInteger.valueOf(179424691));
    return (bigInteger);
  }

  public static BigInteger ultrafactorial (int n) {
    BigInteger bigInteger = new BigInteger ("1");
    for (int i = 1; i <= n; i++) {    
      bigInteger = bigInteger.multiply (superfactorial (i));
    }
    bigInteger = bigInteger.mod (BigInteger.valueOf(179424691));
    return (bigInteger);
  }
}