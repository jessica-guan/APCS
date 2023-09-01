import java.util.*;

public class SqrtCurve {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter grade: ");
        double x = console.nextDouble() * 0.01;
        double a = x;
        while (Math.abs(a*a-x)>1e-15) {
            a = 0.5*(a + x/a);
            System.out.println(a);
        }
        a *= 100;
        String grade = null;
        if (a>=90 && a<=100) {
            grade = "A";
        }
        else if (a>=80 && a<90) {
            grade = "B";
        }
        else if (a>=70 && a<80) {
            grade = "C";
        }
        else if (a>=60 && a<70) {
            grade = "D";
        }
        else if (a>=0 && a<60) {
            grade = "E";
        }
        
        if (a%10 >= 7 || a==100) {
            grade += "+";
        }
        else if (a%10 <= 3) {
            grade += "-";
        }
        System.out.println(grade);
        console.close();
    }
}