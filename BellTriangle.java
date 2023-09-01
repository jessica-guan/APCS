/* Largest bell number that can be calculated using integer data type is 1382958545 (15th bell number)

My IDE does not support colored text in the console, but I could use the following code if it did

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

I could alternate among the colors in the for loop using the mod function */

import java.util.*;

public class BellTriangle  {  
	private static class BellNumber {  
		private List<Integer> arr;  
		BellNumber(int n) {  
			int length = n * (n + 1) / 2;  
			arr = new ArrayList<>(length);  
			for (int i = 0; i < length; ++i) {  
				arr.add(0);  
			}  
			set(1, 0, 1);  
			for (int i = 2; i <= n; ++i) {  
				set(i, 0, get(i - 1, i - 2));  
				for (int j = 1; j < i; ++j) {  
					int value = get(i, j - 1) + get(i - 1, j - 1);  
					set(i, j, value);  
				}  
			}  
		}
		
		private int index(int row, int col)	{  
			if (row > 0 && col >= 0 && col < row) {  
				return row * (row - 1) / 2 + col;  
			}   
			else {  
				throw new IllegalArgumentException();  
			}  
		}
		
		public int get(int row, int col) {  
			int i = index(row, col);  
			return arr.get(i);  
		}
		
		public void set(int row, int col, int value) {  
			int i = index(row, col);  
			arr.set(i, value);  
		}  
	}
	
	public static void main(String args[]) {
		int rows = 15; 
		BellNumber bt = new BellNumber(rows);
		for (int i = 1; i <= rows; i++) {
			System.out.print(bt.get(i, 0));
			for (int j = 1; j < i; j++) {  
				System.out.printf(" %d", bt.get(i, j));  
			}
			System.out.println();
		}  
	}
	
}  