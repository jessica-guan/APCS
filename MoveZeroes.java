public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {1, 0, 30, 9, 0, 0, 26, 15};
        pull(array);
    }
    public static void pull(int[] array) {
        int zeroCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroCount++;
                for (int j = i; j >= zeroCount; j--) {
                    array[j] = array[j-1];
                }
                array[zeroCount-1] = 0;
            }
        }
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]);
    }
}