import java.util.*;

public class MaxString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = console.nextLine();
        System.out.print("max char:     ");
        char biggest = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > biggest) {
                biggest = s.charAt(i);
            }
        }
        System.out.println(biggest);
        System.out.print("in order:     ");
        String inOrder = "" + biggest;
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < inOrder.length(); j++) {
                if (a == 0 && s.charAt(i) == biggest) {
                    a++;
                    break;
                }
                if (s.charAt(i) < inOrder.charAt(j)) {
                    inOrder = inOrder.substring(0, j) + s.charAt(i) + inOrder.substring(j, inOrder.length());
                    break;
                }
                else if (j == inOrder.length()-1){
                    inOrder += s.charAt(i);
                    break;
                }
            }
        }
        System.out.println(inOrder);
        console.close();
    }
}