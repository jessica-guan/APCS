import java.util.*;

public class PolynomialEquation {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] xvalues = new int[4];
		int[] yvalues = new int[4];
		for (int i = 0; i < 4; i++) {
			xvalues[i] = console.nextInt();
			yvalues[i] = console.nextInt();
		}
		int[][] shift = new int[4][1];
		for (int i = 0; i <= 3; i++) {
			shift[i][0] = yvalues[i];
		}
		double equations [][] = new double[4][4];
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				equations[i][j] = (int) Math.pow(xvalues[i], (3 - j));
			}
		}
		for (int i = 0; i <= 3; i++) {
			equations[i][3] = 1;
		}
		double[][] inverted = invert(equations);
		double[][] coefficients = new double[4][1];
		for (int k = 0; k < 4; k++) {
			for (int j = 0; j < 1; j++) {
				for (int m = 0; m < 4; m++) {
					coefficients[k][j] += inverted[k][m] * shift[m][j];
				}
			}
		}
		System.out.println();
		System.out.print("y = ");
		if (Math.rint(coefficients[0][0]) > 1) {
			System.out.print((int) Math.rint(coefficients[0][0]) + "x^3 ");
		} else if (Math.rint(coefficients[0][0]) == 1) {
			System.out.print("x^3 ");
		} else if (Math.rint(coefficients[0][0]) == -1) {
			System.out.print("-x^3 ");
		} else {
			System.out.print((int) Math.abs(Math.rint(coefficients[2][0])) + "x^3 ");
		}
		if (Math.rint(coefficients[1][0]) > 1) {
			System.out.print("+ ");
			System.out.print((int) Math.rint(coefficients[1][0]));
			System.out.print("x^2 ");
		} else if (Math.rint(coefficients[1][0]) == 1) {
			System.out.print("+ x^2 ");
		} else if (Math.rint(coefficients[1][0]) < -1) {
			System.out.print("- ");
			System.out.print((int) Math.abs(Math.rint(coefficients[1][0])));
			System.out.print("x^2 ");
		} else {
			System.out.print("- x^2 ");
		}
		if (Math.rint(coefficients[2][0]) > 1) {
			System.out.print("+ ");
			System.out.print((int) Math.rint(coefficients[2][0]));
			System.out.print("x ");
		} else if (Math.rint(coefficients[2][0]) == 1) {
			System.out.print("+ x ");
		} else if (Math.rint(coefficients[2][0]) < -1) {
			System.out.print("- ");
			System.out.print((int) Math.abs(Math.rint(coefficients[2][0])));
			System.out.print("x ");
		} else {
			System.out.print("- x ");
		}
		if (Math.rint(coefficients[3][0]) > 0) {
			System.out.print("+ ");
			System.out.print((int) Math.rint(coefficients[3][0]));
		} else if (Math.rint(coefficients[3][0]) < 0) {
			System.out.print("- ");
			System.out.print((int) Math.abs(Math.rint(coefficients[2][0])));
		}
		System.out.println();
		console.close();
	}
	
	public static double[][] invert(double a[][]) {
		int n = a.length;
	    double x[][] = new double[n][n];
	    double b[][] = new double[n][n];
	    int index[] = new int[n];
	    for (int i = 0; i < n; ++i) 
	    	b[i][i] = 1;
	    gaussian(a, index);
	    for (int i = 0; i < n - 1; ++i)
	        for (int j = i + 1; j < n; ++j)
	        	for (int k = 0; k < n; ++k)
	        		b[index[j]][k] -= a[index[j]][i] * b[index[i]][k];
	    for (int i = 0; i < n; ++i) {
	        x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
	        for (int j = n - 2; j >= 0; --j) {
	        	x[j][i] = b[index[j]][i];
	            for (int k = j + 1; k < n; ++k) {
	            	x[j][i] -= a[index[j]][k] * x[k][i];
	            }
	            x[j][i] /= a[index[j]][j];
	        }
	     }
	     return x;
	}
	 
	public static void gaussian(double a[][], int index[]) {
		int n = index.length;
	    double c[] = new double[n];
	    for (int i = 0; i < n; ++i) 
	        index[i] = i;
	    for (int i = 0; i < n; ++i) {
	        double c1 = 0;
	        for (int j = 0; j < n; ++j) {
	            double c0 = Math.abs(a[i][j]);
	            if (c0 > c1)
	            	c1 = c0;
	        }
	        c[i] = c1;
	     }
	     int k = 0;
	     for (int j = 0; j < n - 1; ++j) {
	         double pi1 = 0;
	         for (int i = j; i < n; ++i) {
	        	 double pi0 = Math.abs(a[index[i]][j]);
	             pi0 /= c[index[i]];
	             if (pi0 > pi1) {
	            	 pi1 = pi0;
	                 k = i;
	             }
	         }
	         int itmp = index[j];
	         index[j] = index[k];
	         index[k] = itmp;
	         for (int i = j + 1; i < n; ++i) {
	        	 double pj = a[index[i]][j] / a[index[j]][j];
	             a[index[i]][j] = pj;
	             for (int l = j + 1; l < n; ++l)
	            	 a[index[i]][l] -= pj * a[index[j]][l];
	        }
	    }
	}
}
