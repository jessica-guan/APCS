import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("enter integer n for nth prime (1st prime = 2): ");
        int num = console.nextInt();
        int count = 1;
        int current = 2;
        while (count < num) {
            if (current == 2) {
                current++;
            }
            else {
                current += 2;
            }
            if (findPrime(current)) {
                count++;
            }
        }
        System.out.println("Prime #" + num + " is " + current);
        console.close();
    }
    public static boolean findPrime(int current) {
        if (current == 3) {
            return true;
        }
        else if (current % 3 == 0) {
            return false;
        }
        else {
            for (int i = 5; i <= Math.sqrt(current); i += 2) {
                if (current % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}