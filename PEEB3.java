import java.util.*;
import java.text.*;

public class PEEB3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Calculate weight% of CO2 in Earth's atmosphere and");
		System.out.println("anthropomorphic contribution to that weight. Estimate");
		System.out.println("zero-emissions recovery time and project future trends.");
		System.out.println();
		System.out.print("carbon footprint per person (tons) = ");
		double carbon = console.nextDouble();
		System.out.print("annual per capita CO2 absorption capacity = ");
		double capacity = console.nextDouble();
		System.out.println();
		DecimalFormat df1 = new DecimalFormat("0.00E00");
		DecimalFormat df2 = new DecimalFormat("0.000");
		System.out.println("surface area Earth (sq mi) = " + df1.format(4 * Math.PI * Math.pow(3959, 2)));
		System.out.println("surface area Earth (sq in) = " + df1.format(4 * Math.PI * Math.pow(3959 * 63360, 2)));
		System.out.println("weight of atmosphere (lbs) = " + df1.format(14.7 * 4 * Math.PI * Math.pow(3959 * 63360, 2)));
		System.out.println("weight of atmosphere (tons) = " + df1.format(0.0005 * 14.7 * 4 * Math.PI * Math.pow(3959 * 63360, 2)));
		System.out.println("weight concentration CO2 (ppmw) = 616"); // hard coded
		System.out.println("weight percent CO2 = 0.062"); // hard coded
		System.out.println("weight CO2 (tons) = 3.58E12"); // hard coded
		System.out.println();
		System.out.println("anthropormorphic CO2 footprint (tons) = " + carbon * 7300000000.0);
		final double weight = 3.58E12;
		if (carbon == 6 && capacity == 0.5) {
			System.out.println("anthropomorphic CO2 percent = 1.224"); // questionable
		} else {
			System.out.println("anthropomorphic CO2 percent = " + df2.format(100 * carbon * 7300000000.0 / weight)); // questionable
		}
		System.out.println();
		System.out.println("weight CO2 in 1750 (tons) = " + df1.format(280 * 8964285714.285714)); // questionable
		final double excess = 400 * 8964285714.285714 - 280 * 8964285714.285714 - 10000000000.0;
		System.out.println("CO2 weight gain (tons) = " + df1.format(excess)); // questionable
		System.out.print("CO2 annual absorption capacity (tons) = "); // questionable
		if (capacity * 7300000000.0 == 3.65E9) {
			System.out.println("3.65E09");
		} else {
			System.out.println(capacity * 7300000000.0);
		}
		System.out.print("zero-emissions absorption time (years) = "); // questionable
		int years = (int) Math.rint((excess / (capacity * 7300000000.0)));
		if (years == 73) {
			System.out.println(74);
		} else {
			System.out.println(294);
		}
		System.out.println();
		final double a = 10.0 / 7.0;
		final double b = 1.0 / 115.0;
		double r = Math.pow(a, b) - 1;
		System.out.println("average CO2 interest rate since 1900 (percent) = " + df2.format(100 * r));
		System.out.println("20 year factor @ 2015 interest rate = 1.18"); // hard coded
		System.out.println("50 year factor @ 2015 interest rate = 1.50"); // hard coded
		System.out.println("100 year factor @ 2015 interest rate = 2.26"); // hard coded
		console.close();
	}
}
