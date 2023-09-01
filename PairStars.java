import java.util.*;

public class PairStars {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String s = console.next();
		pairStars(s);
		console.close();
	}
	public static void pairStars(String s) {
		if (s.length() == 1) {
			System.out.println(s);
		} else if (s.charAt(0) == s.charAt(1)) {
			System.out.print(s.charAt(0));
			pairStars ("*" + s.substring(1));
		} else {
			System.out.print(s.charAt(0));
			pairStars (s.substring(1));
		}
	}
}
