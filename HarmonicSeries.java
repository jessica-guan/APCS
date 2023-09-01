import java.util.*;

public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double limit = console.nextDouble();
		double actualsum = 0;
		int numofterms = 0;
		int i = 1;
		final long startTime = System.currentTimeMillis();
		while (actualsum <= limit) {
			actualsum += 1.0 / i;
			numofterms++;
			i++;
		}
		final long endTime = System.currentTimeMillis(); 
		System.out.printf("Actual sum = %.15f", actualsum);
		System.out.println();
		System.out.println("Number of terms required: " + numofterms);
		System.out.println("Total execution time: " + (endTime - startTime));
		console.close();
	}
}
