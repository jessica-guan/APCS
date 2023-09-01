import java.util.*;

public class SwapDigitPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int n = console.nextInt();
        System.out.println("swapped result = " + swapDigitPairs(n));
        console.close();
    }
    public static int swapDigitPairs(int n) {
        int result = 0;
        int digitPlace = 1;
        while (n > 9) {
            result = result + digitPlace * 10 * (n % 10);
            n /= 10;
            result += digitPlace * (n % 10); 
            n /= 10;
            digitPlace *= 100;
        }
        return result + digitPlace * n;
    }
}