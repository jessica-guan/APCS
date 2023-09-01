import java.util.*;

public class SignificantFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("enter any number, integer or decimal: ");
        String input = console.nextLine();
        boolean isTrailingZero = false;
        boolean isFillerZero = true;
        int sigfig = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) != '0' && input.charAt(index) != '.') { // all non-zero digits are significant
                sigfig++;
                isFillerZero = false;
            }
            if (isFillerZero == true) { // filler zeros do not count
                continue;
            } else if (input.charAt(index) == '0' && isFillerZero == false) {
                if ((input.indexOf('.') != -1)) { // if there is a decimal point somewhere then 
                    sigfig++;
                } else {
                    continue;
                }
            }
            if (input.charAt(index) == '.') {
                isTrailingZero = true;
            }
            if (input.charAt(index) == '0' && isTrailingZero == true) {
                sigfig++;
            }
        }
        System.out.println(sigfig);
        console.close();
    }
}