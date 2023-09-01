import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows = console.nextInt();
        int num1 = 1;
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < (2*rows-2*(i+1)); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                if (j == 0) {
                    System.out.print(1);
                }
                else {
                    num1 = (int) Math.round(num1 * (((double)i - (double)j + 1)/ (double)j));
                    System.out.printf("%4d", num1);
                }
            }
            System.out.println();
            num1 = 1;
        }
        console.close();
    }
}