import java.io.*;
import java.util.*;

public class RemoveEvensForReal {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Removes strings of even length from an array.\n" + "Enter filename for file containing strings: ");
        Scanner input1 = new Scanner(System.in);
        String text = input1.next();
        File f = new File(text);
        System.out.println("Enter two indices for range of odd words to be printed out: ");
        int n1 = input1.nextInt();
        int n2 = input1.nextInt();
        ArrayList<String> oddList = new ArrayList<>();
        int count = 0;
        Scanner input2 = new Scanner(f);
        while (input2.hasNext()) {
            String word = input2.next();
            if (word.length() % 2 == 1) {
                oddList.add(word);
            }
            count++;
        }
        input1.close();
        input2.close();
        System.out.println("initial list.size(): " + count);
        System.out.println("final   list.size(): " + oddList.size());
        System.out.println("odd words from index " + n1 + " to " + n2 + ":");
        for (int i = n1; i <= n2; i++) {
            System.out.println(oddList.get(i));
        }
    }
}