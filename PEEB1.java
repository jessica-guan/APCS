import java.util.*;
import java.text.*;

public class PEEB1 {
	public static void main (String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println ("Radiant photon flux at a given wavelength");
		System.out.println ("and temperature using Planck's Law.");
		System.out.print ("wavelength in microns: ");
		double wavelength = console.nextDouble() / 1e+6;
		System.out.print ("temperature in degrees Kelvin: ");
		double temperature = console.nextDouble();
		final double h = 6.626068E-34;
		final double c = 299792500;
		final double k = 1.38066E-23;
		double numerator = 2 * h * Math.pow(c, 2) * Math.pow(wavelength, -5);
		double expnum = h * c;
		double expden = wavelength * k * temperature;
		double exponent = expnum / expden;
		double denominator = Math.pow(Math.E, exponent) - 1;
		double B = numerator / denominator;
		DecimalFormat df1 = new DecimalFormat ("0.00E00");
		System.out.println ("radiant flux B = " + df1.format(B).toLowerCase() + " Wm-3steradian-1");
		console.close();
	}
}
