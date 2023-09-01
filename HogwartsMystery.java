import java.util.*;

public class HogwartsMystery {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = console.nextInt();
        if (length % 8 == 0) {
        	int[] numbers = new int[length + 1];
        	for (int i = 1; i < numbers.length; i++) {
        		numbers[i] = console.nextInt();
        	}
        	int index = 1;
        	int count = 1;
        	int sum = 0;
        	char[] ascii = new char[numbers.length / 4 + 1];
        	while (index < numbers.length) {
        		if (index % 4 == 1 || index % 4 == 0) {
        			sum += numbers[index];
        		}
        		if (index % 4 == 2 || index % 4 == 3) {
        			if (count == 1) {
        				sum += numbers[index + 4];
        			}
        			else {
        				sum += numbers[index - 4];
        			}
        		}
        		if (index % 4 == 0) {
        			ascii[index / 4] = (char) sum;
        			sum = 0;
        			if (count == 1) {
        				count++;
        			}
        			else {
        				count--;
        			}
        		}
        		index++;
        	}
        	for (int i = 1; i < ascii.length; i++) {
        		System.out.print(ascii[i]);
        	}
        	System.out.println();
        } else {
        	int[] numbers = new int[length + 1];
        	for (int i = 1; i < numbers.length; i++) {
        		numbers[i] = console.nextInt();
        	}
        	int index = 1;
        	int count = 1;
        	int sum = 0;
        	char[] ascii = new char[numbers.length / 4 + 1];
        	while (index < numbers.length - 4) {
        		if (index % 4 == 1 || index % 4 == 0) {
        			sum += numbers[index];
        		}
        		if (index % 4 == 2 || index % 4 == 3) {
        			if (count == 1) {
        				sum += numbers[index + 4];
        			}
        			else {
        				sum += numbers[index - 4];
        			}
        		}
        		if (index % 4 == 0) {
        			ascii[index / 4] = (char) sum;
        			sum = 0;
        			if (count == 1) {
        				count++;
        			}
        			else {
        				count--;
        			}
        		}
        		index++;
        	}
        	for (int i = 1; i < ascii.length - 1; i++) {
        		System.out.print(ascii[i]);
        	}
        	System.out.println(".");
        }
        console.close();
    }
}