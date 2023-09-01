import java.util.*;

public class LastIndexOf {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] arr = new int[7];
		System.out.println("Please enter seven elements of an integer array and a value: ");
		for(int i = 0; i < 7; i++) {  
			arr[i] = console.nextInt();  
		}  
		int num = console.nextInt();
		int temp = -1;
		for(int i = 0; i < 7; i++) {
			if (arr[i] == num) {
				temp = i;
			}
		}
		System.out.println("Last index of value = " + temp);
		console.close();
	}
}
