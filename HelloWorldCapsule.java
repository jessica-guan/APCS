public class HelloWorldCapsule {
	public static void main (String [] args) {
		drawUpsideDownV();
		drawHello();
		drawRightsideUpV();
		drawUpsideDownV();
		drawWorld();
		drawRightsideUpV();
	}

	public static void drawUpsideDownV() {
		System.out.println ("    /\\");
		System.out.println ("   /  \\");
		System.out.println ("  /    \\");
		System.out.println (" /      \\");
		System.out.println ("/        \\");
	}

	public static void drawHello() {
		System.out.println ("| Hello  |");
	}

	public static void drawRightsideUpV() {
		System.out.println ("\\        /");
		System.out.println (" \\      /");
		System.out.println ("  \\    /");
		System.out.println ("   \\  /");
		System.out.println ("    \\/");
	}

	public static void drawWorld() {
		System.out.println ("| World! |");
	}
}