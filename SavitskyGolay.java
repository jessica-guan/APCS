import java.util.*;
import java.awt.*;
import java.io.*;

public class SavitskyGolay {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("ParabolaPlusGaussian.txt");
		Scanner input = new Scanner(f);
		DrawingPanel panel = new DrawingPanel (800, 400);
		Graphics g = panel.getGraphics();
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 0.75F);
		g.setFont(newFont);
		int count = 0;
		for (int i = 0; i <= 799; i++) {
			g.drawOval(input.nextInt(), (int) Math.rint(400 - input.nextDouble()), 1, 1);
			if ((i % 24 == 0) && i >= 24) {
        		g.drawLine(i, 380, i, 385);
        		int c = 1960 + count * 2;
        		g.drawString(Integer.toString(c), i - 12, 395);
        		count++;
        	}
		}
		System.out.println("select Savitsky-Golay filter: ");
		System.out.println("smoothing");
		System.out.println("quadratic or cubic");
		System.out.println("  0   {  0,    0,   -3,   12,  17,  12,  -3,   0,   0}");
		System.out.println("  1   {  0,   -2,    3,    6,   7,   6,   3,  -2,   0}");
		System.out.println("  2   {-21,   14,   39,   54,  59,  54,  39,  14, -21}");
		System.out.println("quartic or quintic");
		System.out.println("  3   {  0,    5,  -30,   75, 131,  75, -30,   5,   0}");
		System.out.println("  4   { 15,  -55,   30,  135, 179, 135,  30, -55,  15}");
		System.out.println();
		System.out.println("1st derivative");
		System.out.println("linear or quadratic");
		System.out.println("  5   {  0,    0,    0,   -1,   0,   1,   0,   0,   0}");
		System.out.println("  6   {  0,    0,   -2,   -1,   0,   1,   2,   0,   0}");
		System.out.println("  7   {  0,   -3,   -2,   -1,   0,   1,   2,   3,   0}");
		System.out.println("  8   { -4,   -3,   -2,   -1,   0,   1,   2,   3,   4}");		
		System.out.println("cubic or quartic");
		System.out.println("  9   {  0,    0,    1,   -8,   0,   8,  -1,   0,   0}");
		System.out.println("  10  {  0,   22,  -67,  -58,   0,  58,  67, -22,   0}");
		System.out.println("  11  { 86, -142, -193, -126,   0, 126, 193, 142, -86}");
		System.out.print("Enter an integer 0 - 11 corresponding to desired filter: ");
		Scanner console = new Scanner(System.in);
		int filterKey = console.nextInt();
        System.out.println();
        int[][] array = {
        		{  0,    0,   -3,   12,  17,  12,  -3,   0,   0}, 
        		{  0,   -2,    3,    6,   7,   6,   3,  -2,   0},
        		{-21,   14,   39,   54,  59,  54,  39,  14, -21},
        		{  0,    5,  -30,   75, 131,  75, -30,   5,   0},
        		{ 15,  -55,   30,  135, 179, 135,  30, -55,  15},
        		{  0,    0,    0,   -1,   0,   1,   0,   0,   0},
        		{  0,    0,   -2,   -1,   0,   1,   2,   0,   0},
        		{  0,   -3,   -2,   -1,   0,   1,   2,   3,   0},
        		{ -4,   -3,   -2,   -1,   0,   1,   2,   3,   4},
        		{  0,    0,    1,   -8,   0,   8,  -1,   0,   0},
        		{  0,   22,  -67,  -58,   0,  58,  67, -22,   0},
        		{ 86, -142, -193, -126,   0, 126, 193, 142, -86}
        };
        ArrayList<Double> list = new ArrayList<Double>();
        ArrayList<Double> sums = new ArrayList<Double>();
        File temp = new File("Results.txt");
		Scanner result = new Scanner(temp);
		while (result.hasNextDouble()) {
			list.add(result.nextDouble());
		}
		for (int i = 0; i < list.size(); i++) {
			sums.add(list.get(i));
		}
        for (int i = 5; i <= 794; i++) {
        	double sum = (array[filterKey][0] * list.get(i - 4)) + (array[filterKey][1] * list.get(i - 3)) + (array[filterKey][2] * list.get(i - 2)) + (array[filterKey][3] * list.get(i - 1)) + (array[filterKey][4] * list.get(i)) + (array[filterKey][5] * list.get(i + 1)) + (array[filterKey][6] * list.get(i + 2)) + (array[filterKey][7] * list.get(i + 3)) + (array[filterKey][8] * list.get(i + 4));
        	sums.set(i, 4 * sum);
        	g.drawOval(i, (int) (400 - Math.rint(sums.get(i))), 1, 1);
        }
		input.close();
		result.close();
		console.close();
	}
}
