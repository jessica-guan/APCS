import java.util.*;

public class Mice {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int numofnums = console.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < numofnums; i++) {
			list.add(console.nextInt());
		}
		int numofmice = console.nextInt();
		int count = 0;
		int temp = 0;
		boolean stop = false;
		for (int i = 0; i < numofmice; i++) {
			int numofnumstwo = console.nextInt();
			int[] arraytwo = new int[numofnumstwo];
			for (int j = 0; j < numofnumstwo; j++) {
				arraytwo[j] = console.nextInt();
			}
			ArrayList<Integer> order = new ArrayList<>();
			ArrayList<Integer> copy = new ArrayList<>();
			for (int j = 0; j < numofnumstwo; j++) {
				if (list.contains(arraytwo[j])) {
					order.add(list.indexOf(arraytwo[j]));
					copy.add(list.indexOf(arraytwo[j]));
				} else {
					temp = count;
					stop = true;
				}
			}
			Collections.sort(copy);
			if (copy.equals(order)) {
				count++;
			} else {
				temp = count;
				stop = true;
			}
		}
		if (stop) {
			System.out.println(temp);
		} else {
			System.out.println(count);
		}
		console.close();
	}
}
