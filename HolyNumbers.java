import java.util.*;
import java.math.*;

public class HolyNumbers {
  public static void main(String[] args) {
	  Scanner console = new Scanner(System.in);
		char a = console.next().charAt(0);
		char b = console.next().charAt(0);
		int c = console.nextInt();
		int num = 0, sum = 0, count = 0;
		String str1 = "", str2 = "";
		for(int i = 1; i <= c; i++) {
			str1 += "9";
		}
		BigInteger x = new BigInteger(str1);
		for (BigInteger i = BigInteger.ZERO; i.compareTo(x) < 1; i = i.add(BigInteger.ONE)) {
			str2 = i.toString();
			if (str2.length() == c) {
				for (int j = 0; j < str2.length(); j++) {
					if ((str2.charAt(j) == a) || (str2.charAt(j) == b)) {
						num = Integer.valueOf(str2); 
						while (num > 0) {
				            sum = sum + num % 10;
				            num = num / 10;
				        }
						if ((sum == a) || (sum == b)) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count % 1000000007);
		console.close();
  }
}