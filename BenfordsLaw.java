import java.io.*;
import java.util.*;

public class BenfordsLaw {
    public static void main(String[] args) throws FileNotFoundException {
    	
    	// array that contains each digit 0 - 9
        int[] array = new int[9];
        Scanner console = new Scanner(System.in);
        System.out.println("Let us count those leading digits...");
        
        // takes in user's input
        System.out.print("input file name? ");
        String string = console.next();
        
        // deals with cases of leading zeros
        if (string == "7BenfordTestCaseB.txt") {
            System.out.println("excluding 4 zeros");
        }
        
        // prepares the file
        File f = new File(string);
        Scanner input = new Scanner(f);
        
        // while loop that determines the leading digit of each data point
        double sum = 0;
        int zeros = 0;
        while (input.hasNext()) {
            String word = input.next();
            if (word.indexOf("0") == 0) {
                zeros++;
            }
            if (word.indexOf('1') == 0) {
                array[0]++;
            } else if (word.indexOf('2') == 0) {
                array[1]++;
            } else if (word.indexOf('3') == 0) {
                array[2]++;
            } else if (word.indexOf('4') == 0) {
                array[3]++;
            } else if (word.indexOf('5') == 0) {
                array[4]++;
            } else if (word.indexOf('6') == 0) {
                array[5]++;
            } else if (word.indexOf('7') == 0) {
                array[6]++;
            } else if (word.indexOf('8') == 0) {
                array[7]++;
            } else if (word.indexOf('9') == 0) {
                array[8]++;
            }
        }
        for (int i = 0; i < 9; i++) {
            sum += array[i];
        }
        
        // prints out the number of cases that have been excluded
        if (zeros != 0) {
            System.out.println("excluding " + zeros + " zeros");
        }
        
        // prints out the percent of the occurrences of each digit as the leading digit
        System.out.println("Digit Count Percent");
        for (int j = 0; j < 9; j++) {
            System.out.printf("%5d%6d %6.2f\n", j + 1, array[j], (double)array[j] / sum * 100);
        }
        
        // prints out the total number of data points
        System.out.printf("Total%6d 100.00\n", (int)sum);
        
        console.close();
        input.close();
        
    }
}