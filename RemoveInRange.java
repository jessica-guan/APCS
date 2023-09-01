import java.util.*;

public class RemoveInRange {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		String input = console.next();
		while (!input.equals("lastString")) {
			list.add(input.toLowerCase());
			input = console.next();
		}
		System.out.println("Your original list: " + list.toString());
		System.out.println();
		System.out.println("Now please enter your start String");
		String start = console.next();
		System.out.println();
		System.out.println("Finally, please enter your end String");
		String end = console.next();
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			if (!((start.compareTo(list.get(i)) <= 0) && (end.compareTo(list.get(i)) >= 0))) {
				temp.add(list.get(i));
			}
		}
		System.out.println("Your reduced list: " + temp.toString());
		console.close();
	}
}
