import java.util.*;

public class MathPowPlusPlus {
    public static void pow (int i, int j) {
        int m = i;
        for (int x = 1; x < j; x++) {
            int n = m;
            for (int y = 1; y < i; y++) {
                for (int z = 0; z < n; z++) {
                    m++;
                }
            }
        }
        System.out.println("The answer is " + m);
    }
	public static void main (String[] args) {
		System.out.println ("Enter two integers:");
		Scanner console = new Scanner (System.in);
		int a = console.nextInt();
		int b = console.nextInt();
		pow (a, b);
		console.close();
	}
}