import java.util.*;

public class LargestDeviation {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		double[] array = new double[n];
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            sum += array[i];
        }
		double mean = sum / array.length;
		double result = 0;
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(array[i] - mean);
        }
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
            	result = arr[i];
            }
        }
		for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - mean) == result) {
            	System.out.println((int) array[i]);
            	break;
            }
        }
		console.close();
	}
}
