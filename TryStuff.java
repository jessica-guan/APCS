public class TryStuff {
	public static void main (String[] args) {
		int testNum = 123;
		int a = testNum % 10;
		int b = (testNum % 100) / 10;
		int c = testNum / 100;
		System.out.println ("By integer math: " + ((a * 100) + (b * 10) + c));
		System.out.println ("By string concentration: "  + a + b + c);
	}
}