import java.util.*;

public class MoveDisks {
	public static int moves = 0;
	public static void moveDisks(int n, char from, char to, char temp) {
		if (n == 0) {
			return;
		} else {
			moveDisks(n - 1, from, temp, to);
			System.out.println(from + " -> " + to);
			moves++;
			moveDisks(n - 1, temp, to, from);
		}
	}
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = console.nextInt();
		System.out.print("Enter destination post: ");
		char c = console.next().charAt(0);
		console.close();
		System.out.println("Moves:");
		if (c == 'B') {
			moveDisks(n, 'A', 'B', 'C');
		} else {
			moveDisks(n, 'A', 'C', 'B');
		}
		System.out.println("Number of moves: " + moves);
	}
}
