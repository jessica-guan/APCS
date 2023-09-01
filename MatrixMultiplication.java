import java.util.*;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int row1 = console.nextInt();
		int col1 = console.nextInt();
		int[][] arr1 = new int[row1][col1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr1[i][j] = console.nextInt();
			}
		}
		int row2 = console.nextInt();
		int col2 = console.nextInt();
		if (col1 != row2) {
			System.out.println("Incompatible matrices!");
		} else {
			int[][] arr2 = new int[row2][col2];
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < col2; j++) {
					arr2[i][j] = console.nextInt();
				}
			}
			int[][] arr3 = new int[row1][col2];
			for (int k = 0; k < row1; k++) {
				for (int j = 0; j < col2; j++) {
					for (int m = 0; m < row2; m++) {
						arr3[k][j] += arr1[k][m] * arr2[m][j];
					}
					System.out.printf("%4d", arr3[k][j]);
				}
				System.out.println();
			}
		}
		console.close();
	}
}
