import java.util.*;

public class WriteSequence {
	public static String string = "";
	public static void writeSequence(int n) {
		int temp = 0;
		if (n < 1) {
			throw new IllegalArgumentException();
		} else if (n == 1) {
			string += "1 ";
		} else {
			temp = (n + 1) / 2;
			string += temp + " ";
			if (n != 2) {
				writeSequence(n - 2);
			}
			temp = (n + 1) / 2;
			string += temp + " ";
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		writeSequence(n);
		string = string.trim();
		System.out.println(string);
		console.close();
	}
}