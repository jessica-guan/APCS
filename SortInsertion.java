import java.util.*;

public class SortInsertion {
	public static void sortInsertion(int array[]) {
		printArray(array);
		int n = array.length;
		for (int i = 1; i < n; ++i) {
            int sorted = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > sorted) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = sorted;
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
		System.out.println("insertionSort");
		sortInsertion(array);
		System.out.println();
	}
}
