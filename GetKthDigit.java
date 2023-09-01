import java.util.Scanner;

public class GetKthDigit {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String n = console.next ();
        int k = console.nextInt ();
        if (n.length () - k - 1 < 0) {
            System.out.println (0);
        }
        else {
            System.out.println (n.charAt (n.length() - k - 1));
        }
        console.close();
    }
}