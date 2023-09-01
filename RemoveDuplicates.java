import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		ArrayList<String> string = new ArrayList<String>();
		String input = console.next();
		while (!input.equals("lastString")) {
			string.add(input);
			input = console.next();
		}
		System.out.println();
		System.out.println("Your original list: " + string.toString());
		System.out.println();
		Remove(string);
		System.out.println("Your list with duplicates removed: " + string.toString());
		System.out.println();
		console.close();
	}
	
	public static void Remove(ArrayList<String> array) {
	    for (int i = 0; i < array.size() - 1; i++) {
	        if (array.get(i).equalsIgnoreCase(array.get(i + 1))) {
	            array.remove(i + 1);
	            i--;
	        }
	    }    
	}
}
