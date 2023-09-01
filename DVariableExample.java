public class DVariableExample {
	public static void main(String[] args) {
// Which statements have errors (and will prevent you from compiling)?
		int i = (int) 83.2 / 9;
		char c = 100;
//		c = i;
		c = 'c';
//		c = (int) i;
		double d = i;
		d = c;

// Predict the output of each statement.
// HINT: ASCII character code for 'a' = 97, 'c' = 99, 'h' = 104, 'i' = 105.
		System.out.println(c); 
		System.out.println(c + 12 + i); 
		System.out.println((12 + i) + c);
		System.out.println((d + i) + (char) c + 'a');
		System.out.println((char) d + "hello");
		System.out.println('h' + 'i');
		System.out.println('h' + 'i' + "");
		System.out.println("" + 'h' + 'i');		
		System.out.println();
		char a = 'e';
		System.out.println(a);
		System.out.println(a + 101);
		System.out.println(a + (char) 101);
		System.out.println((char) 101);
		int b = a + (char) 101;
		System.out.println((char) b);
		System.out.println('b');
		System.out.println(a + "Hello");
	}
}
