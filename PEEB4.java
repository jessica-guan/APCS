import java.util.*;

public class PEEB4 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Calculate surface temperature as a function of");
		System.out.println("emissivity for the single-layer atmosphere model.");
		System.out.print("enter emissivity: ");
		double emissivity = console.nextDouble();
		System.out.println("emissivity (= absorptivity) = " + emissivity);
		double surfacetemperature = Math.pow((2 * (1 - 0.3) * 342) / (5.67 * (Math.pow(10, -8) * (2 - emissivity))), 0.25);
		System.out.println("surface temperature = " + Math.round(surfacetemperature) + "K");
		console.close();
	}
}
