import java.util.*;

public class Interleave {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();
		ArrayList<Integer> integer1 = new ArrayList<Integer>();
		int input1 = console.nextInt();
		while (input1 != 0) {
			integer1.add(input1);
			input1 = console.nextInt();
		}
		System.out.println("Your first list: " + integer1.toString());
		System.out.println();
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println();
		ArrayList<Integer> integer2 = new ArrayList<Integer>();
		int input2 = console.nextInt();
		while (input2 != 0) {
			integer2.add(input2);
			input2 = console.nextInt();
		}
		System.out.println("Your second list: " + integer2.toString());
		console.close();
		System.out.println();
		int times = Math.min(integer1.size(), integer2.size());
	    int i;
	    for (i = 0; i < times; i++) {
	        int num = integer2.get(i);
	        integer1.add(2 * i + 1, num);
	    }
	    if (i < integer2.size()) {
	        for (int j = i; j < integer2.size(); j++) {
	        	integer1.add(integer2.get(j));
	        }
	    }
		System.out.println("Your interleaved list: " + integer1.toString());
	}
	
	public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
	    int times = Math.min(a1.size(), a2.size());
	    int i;
	    for (i = 0; i < times; i++) {
	        int num = a2.get(i);
	        a1.add(2 * i + 1, num);
	    }
	    if (i < a2.size()) {
	        for (int j = i; j < a2.size(); j++) {
	            a1.add(a2.get(j));
	        }
	    }
	}
}
