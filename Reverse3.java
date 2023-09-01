import java.util.*;

public class Reverse3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int input = console.nextInt();
		while (input != 0) {
			list.add(input);
			input = console.nextInt();
		}
		console.close();
		System.out.println("Your original list: " + list.toString());
		System.out.println();
		int i = 0;
		for (i = 0; i < list.size() - (list.size() % 3); i += 3) {
			temp.add(list.get(i + 2));
			temp.add(list.get(i + 1));
			temp.add(list.get(i));
		}
		for (int j = i; j < list.size(); j++) {
			temp.add(list.get(j));
		}
		System.out.println("Your reversed3 list: " + temp.toString());
	}
}
