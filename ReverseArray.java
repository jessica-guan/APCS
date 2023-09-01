import java.util.*;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = console.nextInt();
        }
        printBackwards(array);
        console.close();
    }
    public static void printBackwards(int[] n) {
        System.out.print("[");
        for (int i = n.length - 1; i >= 1; i--) {
            System.out.print(n[i] + ", ");
        }
        System.out.print(n[0] + "]");
    }
}