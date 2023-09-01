import java.text.DecimalFormat;
import java.util.*;

public class StandardDeviation {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the integer array dimension: ");
		int n = console.nextInt();
        int[] array = new int[n];
        System.out.println("Please enter the array elements: ");
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            sum += array[i];
        }
        double mean = sum / array.length;
        double total = 0;
        for (int i = 0; i < array.length; i++) {
        	total += Math.pow(array[i] - mean, 2);
        }
        double standev = Math.sqrt(total / (array.length - 1));
        DecimalFormat df1 = new DecimalFormat("0.000");
        System.out.println("Standard deviation = " + df1.format(standev));
        console.close();
	}
}
