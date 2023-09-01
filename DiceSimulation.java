import java.util.*;

public class DiceSimulation {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter desired sum of two dice: ");
        int desiredSum = console.nextInt();
        System.out.print("Enter number of rolls: ");
        long desiredRolls = console.nextLong();
        int sum = 0;
        int count = 0;
        for (long roll = 1; roll <= desiredRolls; roll++) {
            sum = (r.nextInt(6) + 1) + (r.nextInt(6) + 1);
            if (sum == desiredSum) {
                count++;
            }
        }
        System.out.printf("probability: %.2f\n", (double)count / (double)desiredRolls);
        System.exit(0);
        console.close();
    }
}
