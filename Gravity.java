import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][] numbers = new int[console.nextInt()][console.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = console.nextInt();
            }
        }
        gravity(numbers);
        console.close();
    }
    public static void gravity(int[][] numbers) {
        int temp;
        for (int j = 0; j < numbers[0].length; j++) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i][j] == 0) {
                    temp = numbers[i][j];
                    for (int k = i + 1; k < numbers.length; k++) {
                        numbers[k - 1][j] = numbers[k][j];
                    }
                    numbers[numbers.length - 1][j] = temp;
                }
            }
        }
        printArray(numbers);

    }
    public static void printArray(int[][] numbers) {
        for (int j = 0; j < numbers[0].length; j++) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[j][i] + "  ");
            }
            System.out.println();
        }
    }
}