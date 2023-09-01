import java.util.*;

public class SelectionSort {
	public static void selectionSort(int array[]) {
		printArray(array);
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
	        for (int j = i + 1; j < n; j++) {
	        	if (array[j] < array[min]) {
	        		min = j;
	        	}
	        }
	        int temp = array[min];
	        array[min] = array[i];
	        array[i] = temp;
	        printArray(array);
		}
	}
	public static void printArray(int array[]) {
		int n = array.length;
		System.out.print("[");
		for (int i = 0; i < n - 1; ++i)
			System.out.print(array[i] + ", ");
		System.out.print(array[n - 1] + "]");
		System.out.println();
	}
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = console.nextInt();
		}
		console.close();
		System.out.println("selectionSort");
		selectionSort(array);
		System.out.println();
	}
}
