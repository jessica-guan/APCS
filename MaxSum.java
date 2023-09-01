import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int length = console.nextInt();
        for (int i = 0; i < length; i++) {
            list.add(console.nextInt());
        }
        int limit = console.nextInt();
        int[] max = new int[]{0};
        System.out.println(getMax(list, limit, 0, max));
        console.close();
    }
    public static int getMax(ArrayList<Integer> list, int limit, int sum, int[] max) {
        if (sum > max[0] && sum <= limit) {
            max[0] = sum;
        }
        if (list.size() != 0) {
            int num = list.remove(0);
            getMax(list, limit, sum + num, max);
            getMax(list, limit, sum, max);
            list.add(num);
        }
        return max[0];
    }
}