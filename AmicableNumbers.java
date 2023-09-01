public class AmicableNumbers {
    public static int sumOfDiv (int x) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                sum += i;
                if (x / i != i) {
                    sum += x / i;
                }
            }
        }
        return sum;
    }
 
    public static boolean isAmicable (int a, int b) {
        return (sumOfDiv(a) == b && sumOfDiv(b) == a);
    }
 
    public static void printPairs(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isAmicable(arr[i], arr[j])) {
                    System.out.println ("("+ arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
 
    public static void main(String args[]) {
        int arr[] = new int[100000];
        for (int i = 1; i < 100000; i++) {
            arr[i] = (i + 1);
        }
        printPairs(arr, arr.length);
    }
}