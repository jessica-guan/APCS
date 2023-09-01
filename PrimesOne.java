import java.util.*;

public class PrimesOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int n = console.nextInt();
        System.out.println(prime(n));
        System.out.println(primeFactor(n));
        console.close();
    }
    public static int prime(int n) { // calculate for n - 1 to 2
        if (n % 2 != 0) { // if number is odd decrement by 2
            n -= 2;
        }
        else { // if number is even decrement by 1
            n--;
        }
        int i, j;
        for (i = n; i >= 2; i -= 2) { // repeat process until n = 2
            if (i % 2 == 0) { // continue for loop if i is divisible by 2
                continue;
            }
            for (j = 3; j <= Math.sqrt(i); j += 2) { // prime factors in range [1, sqrt(i)]
                if (i % j == 0) { // if i is divisible by j, break loop and start over
                    break;
                }
            }
            if (j > Math.sqrt(i)) { // return i if no prime factors less than sqrt(i)
                return i;
            }
        }
        return 2; // if the lowest prime factor is 2
    }
    public static int primeFactor(int n) {
        int i;
        for (i = 2; i <= n; i++) { 
            if (n % i == 0) { // test for factors
                n /= i; // divide if i is a factor of n, n = that
                i--; // subtract 1 because number can be divided by i multiple times
            }
        }
        return i;
    }
}

