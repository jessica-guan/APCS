import java.util.*;

public class WaysToClimb {
	public static int ways = 0;
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number of stairs to climb (positive integer): ");
		int n = console.nextInt();
		waysToClimb(n);
		System.out.println("Total number of ways = " + ways);
		console.close();
	}
	public static void waysToClimb(int n) {
	    waysToClimb(n, 0, "[");
	}
	private static void waysToClimb(int n, int position, String result) {
	    if (n == position) {
	        int index = result.lastIndexOf(",");
	        if (index != -1) {
	            result = result.substring(0, index) + "]";
	            System.out.println(result);
	            ways++;
	        }
	    } else if (n > position) {
	        waysToClimb(n, position + 1, result + "1, ");
	        waysToClimb(n, position + 2, result + "2, ");
	    }
	}
}
