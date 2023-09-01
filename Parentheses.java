import java.util.*;

public class Parentheses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your string below: ");
        String paren = console.nextLine();
        checkParen(paren);
        console.close();
    }
    public static void checkParen(String paren) {
        int open = 0;
        int largest = 0;
        for (int i = 0; i < paren.length(); i++) {
            if (paren.charAt(i) == '(') {
                open++;
            }
            else if (paren.charAt(i) == ')') {
                open--;
            }
            if (open<0) {
                System.out.println("false");
                return;
            }
            else if (open > largest){
                largest = open;
            }
        }
        if (open != 0) {
            System.out.println("false");
            return;
        }
        System.out.println("true");
        System.out.println(largest);
    }
}