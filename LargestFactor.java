import java.util.*;

public class LargestFactor {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int largest = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				largest = i;
			}
		}
		System.out.println(largest);
		console.close();
	}
}
