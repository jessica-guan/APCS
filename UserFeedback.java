import java.util.*;

public class UserFeedback {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("number of trials: ");
        int n = console.nextInt();
        System.out.println();
        System.out.println("finished trial number: ");
        printStatus(n);
        console.close();
    }
    public static void printStatus(int n) {
        int inc = n / 10;
        for (int i = inc; i <= n; i += inc) {
            System.out.println("                       " + i);
        }
    }
}