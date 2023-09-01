import java.util.*;

public class Maps {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int x = console.nextInt();
		int y = console.nextInt();
		int z = console.nextInt();
		Map<String, Integer> wordM = new HashMap<String, Integer>();
		for (int i = 1; i <= x; i++) {
			wordM.put(console.next(), console.nextInt());
		}
		for (int j = 1; j <= y; j++) {
			String inn = console.next();
			wordM.put(inn, wordM.get(inn) + console.nextInt());
		}
		int total = 0;
		for (int k = 1; k <= z; k++) {
			String s = console.next();
			total += wordM.get(s);
			total %= 1000000007;
		}
		System.out.println(total);
		console.close();
	}
}
