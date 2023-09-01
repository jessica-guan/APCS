import java.util.*;

public class Fencepost {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String string = console.next();
		console.close();
		int i;
		for (i = 0; i < string.length() - 1; i++) {
			System.out.print(string.charAt(i) + ", ");
		}
		System.out.println(string.charAt(i));
	}
}
