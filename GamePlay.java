public class GamePlay {
    public static void main(String[] args) {
        int[][] array = {{1, 3, 3, 4}, {4, 2, 1, 3}, {2, 2, 4, 1}, {3, 4, 2, 1}};
        System.out.println(play(array));
    }
    public static boolean play(int[][] array) {
        int[] count = {0, 0, 0, 0};
        int a = 0;
        int b = 0;
        if (isNotFull(count)) {
            for (int i = 0; i < 4; i++) {
                if (array[a][b] == i) {
                    b = i;
                    count[a]++;
                }
            }
        }
        else {
            return false;
        }
        return true;
    }
    public static boolean isNotFull(int[] count) {
        for (int i = 0; i < 4; i++) {
            if (count[i] >= 4) {
                return false;
            }
        }
        return true;
    }
}