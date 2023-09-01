import java.util.*;

public class PEEB2 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Calculate radiant power per unit area for Sun and Planet using");
		System.out.println("Stefan-Boltzman Law. From balance equation for Planet,");
		System.out.println("(Power in) = (Power out), predict temperature of Planet.");
		System.out.print("Planet: ");
		System.out.print("distance of Planet from Sun (AU): ");
		double distance = console.nextDouble();
		System.out.print("radius of Planet (km): ");
		System.out.print("albedo of Planet: ");
		double albedo = console.nextDouble();
		double sp = Math.rint((6.42 * Math.pow(10,  7) * Math.pow(700000, 2)) / Math.pow(distance * 1.5 * Math.pow(10, 8), 2));
		int intsp = (int) sp;
		System.out.println("photon flux SP = " + intsp);
		System.out.println("average photon flux SAve = " + (int) Math.rint(sp / 4));
		int intalpha = (int) Math.rint(sp / 4 * (1 - albedo));
		System.out.println("including albedo SAve x (1 - alpha) = " + intalpha);
		double tpk = Math.pow((intalpha / (5.67 * Math.pow(10, -8))), 0.25);
		System.out.println("temperature TP (K) = " + (int) Math.rint(tpk));
		System.out.println("temperature TP (C) = " + (int) Math.rint(tpk - 273.15));
		console.close();
	}
}
